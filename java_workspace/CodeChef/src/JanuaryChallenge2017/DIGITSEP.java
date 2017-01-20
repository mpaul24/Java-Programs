package JanuaryChallenge2017;

import java.util.Scanner;

public class DIGITSEP {

	  static Scanner scanner = new Scanner(System.in);
	  
	  static int T;
	  static int N;
	 
	  static char[] S;
	 
	  static int M;
	  static int X;
	  static int Y;
	 
	  static long[][][] max;
	  static int[][] szm;
	 
	  public static void main(String[] args) {
	    T = scanner.nextInt();
	    scanner.nextLine();
	    while (T != 0) {
	      T--;
	      oneT();
	    }
	  }
	 
	  static void oneT() {
	    N = scanner.nextInt();
	    scanner.nextLine();
	 
	    S = scanner.next().toCharArray();
	    scanner.nextLine();
	    
	    M = scanner.nextInt();
	    X = scanner.nextInt();
	    Y = scanner.nextInt();
	    scanner.nextLine();
	    max = new long[Y + 2][N + 1][M];
	    szm = new int[Y + 2][N + 1];
	    szm[0][0] = 1;
	    
	    int i = 0;
	    while(i != Y + 1) {
	      //System.out.println("NBR WORDS = " + i);
	      int j = i;
	      while(j < N && j != i * M + 1) {
	        //System.out.println("  START " + j);
	        int k = 0;
	        long n = 0;
	        while(j + k < N & k < M) {
	          n = n * 10L + (S[j + k] - '0');
	          k++;
	          int x = 0;
	          while(x != szm[i][j]) {
	            max[i + 1][j + k][szm[i + 1][j + k]] = max(max[i + 1][j + k][szm[i + 1][j + k]], gcd(n, max[i][j][x]));
	            x++;
	          }
	          szm[i + 1][j + k]++;
	          //System.out.println("    END " + (j + k) + " N " + n);
	        }
	        j++;
	      }
	      i++;
	    }
	    
	    long m = 0;
	    while(X != Y + 1) {
	      //System.out.println(X + " SEPARATORS = " + max[X + 1][N]);
	      X++;
	      while(szm[X][N] != 0) {
	        szm[X][N]--;
	        m = max(m, max[X][N][szm[X][N]]);
	      }
	    }
	    
	    System.out.println(m);
	  }
	  
	  static long gcd(long x, long y) {
	    while (y != 0) {
	      long tmp = x;
	      x = y;
	      y = tmp % y;
	    }
	    return x;
	  }
	 
	 
	  static long max(long x, long y) {
	    long r;
	    if (x > y) {
	      r = x;
	    } else {
	      r = y;
	    }
	    return r;
	  }

}

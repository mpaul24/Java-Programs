package JanuaryChallenge2017;

import java.util.Scanner;

public class CAPIMOVE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long test = sc.nextLong();
		for(int tt=0;tt<test;tt++)
		{
			int N = sc.nextInt();
			long[] value = new long[N];
			for(int i=0;i<N;i++)
			{
				value[i] = sc.nextLong();
			}
			int[][] matrix = new int[N][N];
			for(int i=0;i<N-1;i++)
			{
				int V = sc.nextInt()-1; 
				int U = sc.nextInt()-1;
				matrix[V][U] = 1;
				matrix[U][V] = 1;
			}
			for(int i=0;i<N;i++)
			{
				int max = -1;
				long valueMax = -1;
				for(int j=0;j<N;j++)
				{
					if(matrix[i][j]!=1 && value[j]>valueMax && j!=i)
						{max = j;
						valueMax = value[j];
						}
				}
				
				/*if(i<N-1)
					System.out.print((max+1)+" ");
				else
				 	System.out.print((max+1));*/
				System.out.print((max+1)+" ");
			}
			System.out.println();
			
		}
	}

}
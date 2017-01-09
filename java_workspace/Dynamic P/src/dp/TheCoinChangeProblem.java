package dp;

import java.util.Scanner;

public class TheCoinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N,M;
		N = sc.nextInt();
		M = sc.nextInt();
		int[] coins = new int[M];
		for(int i=0;i<M;i++)
		{
			coins[i] = sc.nextInt();
		}
		checkCoins(coins,N);
		

	}

	private static void checkCoins(int[] coins,int N) {
		// TODO Auto-generated method stub
		int[] H = new int[N+1];
		int[] T = new int[N+1];
		for(int i=0;i<=N;i++)
		{
			if(i==0) H[i] = 0;
			else H[i] = Integer.MAX_VALUE-1;
			T[i] = -1;
		}
		for(int i=0;i<coins.length;i++)
		{
			for(int j=0;j<=N;j++)
			{
				if(j>=coins[i])
				{
					if(H[j-coins[i]]+1<H[j])
					{
						H[j] = H[j-coins[i]]+1;
						T[j] = i;
					}
				}
			}
		}
		System.out.println(H[N]);
		
	}

}

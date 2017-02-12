package codechef;

import java.io.IOException;
import java.util.Scanner;

public class MFREQ {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		int[][] dp = new int[n][n];
		int[][] c = new int[n][n];
		for(int i=0;i<n;i++)
		{
			int count=0,max=0;
			for(int j=i;j<n;j++)
			{
				if(j==i){
					dp[i][j]=array[j];
					count++;
					c[i][j]=count;
				}
					
				else{
					if(array[j]==array[j-1]){
						count++;
						if(max<count) {
							max =count;
							dp[i][j]=array[j];
						}
						else{
						dp[i][j]=dp[i][j-1];
						}
						c[i][j]=count;
					}
					else
					{
						count =1;
						dp[i][j] = dp[i][j-1];
						c[i][j]=count;
						
					}	
				}
				//System.out.print(dp[i][j]+"  ");
			}
			//System.out.println();
		}
		
		for(int i=0;i<m;i++)
		{
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;
			int k = sc.nextInt();
			if(c[l][r]>k)
			{
				System.out.println(dp[l][r]);
			}
			else
			{
				System.out.println(-1);
			}
		}
	}

}

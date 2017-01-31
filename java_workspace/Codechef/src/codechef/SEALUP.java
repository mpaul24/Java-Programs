package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class SEALUP {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int tt=0;tt<test;tt++)
		{
			int N = sc.nextInt();
			int[] X = new int[N];
			int[] Y = new int[N];
			for(int i=0;i<N;i++)
			{
				X[i] = sc.nextInt();
				Y[i] = sc.nextInt();
			}
			int M = sc.nextInt();
			int[] L = new int[M];
			int[] C = new int[M];
			for(int i=0;i<M;i++)
			{
				L[i] = sc.nextInt();
				C[i] = sc.nextInt();
			}
			//double[][] array = new double[N][M];
			
			int[] distance = new int[N];
			int d = 9;
			for(int i=0;i<N;i++)
			{
				distance[i] = (int) Math.sqrt(Math.pow(X[i%N]-X[(i+1)%N], 2)+Math.pow(Y[i%N]-Y[(i+1)%N], 2));
				//System.out.println(distance[i]);
				if(d<distance[i])
					d = distance[i];
			}
			int max = (d+1);
			int[][] array = new int[M][max];
			for(int i=0;i<M;i++)
			{
				for(int j=0;j<max;j++)
				{
					if(j==0) array[i][j]=0;
					else{
						if(i==0)
						{
							if(j<L[i]) array[i][j] = C[i];
							else{
								if(j%L[i]==0) array[i][j] = j/L[i]*C[i];
								else {array[i][j] = ((j/L[i])+1)*C[i];
									//System.out.println(array[i][j]);
								}
							}
							//array[i][j] = (j/L[i]) * C[i];
						}
						else{
							if(j<L[i]) array[i][j] = Math.min(array[i-1][j], C[i]);
							else{
								array[i][j] = Math.min(array[i-1][j], C[i]+array[i][j-L[i]]);
							}
						}
					}
				}
			}
			/*for(int i=0;i<M;i++)
			{
				for(int j=0;j<max;j++)
				{
					//System.out.print((int)array[i][j]+" ");
				}
				//System.out.println();
			}*/
			int sum=0;
			for(int i=0;i<N;i++)
			{
				sum += array[M-1][distance[i]];
			}
			System.out.println(sum);
			
			
		}
	}

}

package codechef;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CAPIMOVE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int tt=0;tt<test;tt++)
		{
			int n = sc.nextInt();
			Set<Integer> set = new HashSet<>();
			int[] array = new int[n];
			for(int i=0;i<n;i++)
			{
				array[i] = sc.nextInt();
				set.add(array[i]);
			}
			int[][] ss = new int[n][n];
			int[] a = new int[n];
			
			for(int i=0;i<n-1;i++)
			{
				int v = sc.nextInt();
				int u = sc.nextInt();
				ss[v-1][a[v-1]] = u;
				a[v-1]++;
				ss[u-1][a[u-1]] = v;
				a[u-1]++;
			}
			
			for(int i=0;i<n;i++)
			{
				set.remove(array[i]);
				for(int j=0;j<n;j++)
				{
					if(ss[i][j]==0) break;
					else
					{
						//System.out.print(array[ss[i][j]-1]);
						set.remove(array[ss[i][j]-1]);
					}
					//System.out.println("Hello");
				}
				int max=-1;
				for(Integer element : set)
				{
					if(max<element) max = element;
				}
				for(int j=0;j<n;j++)
				{
					if(array[j]==max)
					{
						System.out.println(j+1);
						break;
					}
				}
				//System.out.println("Max: "+max);
				set.add(array[i]);
				for(int j=0;j<n;j++)
				{
					if(ss[i][j]==0) break;
					else
					{
						set.add(array[ss[i][j]-1]);
					}
				}
			}
		}
		
	}

}

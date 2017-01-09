package implementation;

import java.io.*;
import java.util.*;

public class GridSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int z=0;z<test;z++)
		{
			int R = sc.nextInt();
			int C = sc.nextInt();
			sc.nextLine();
			char[][] G = new char[R][C];
			for(int i=0;i<R;i++)
			{
				String s = sc.nextLine();
				for(int j=0;j<C;j++)
				{
					G[i][j] = s.charAt(j);
				}
			}
			int r = sc.nextInt();
			int c = sc.nextInt();
			sc.nextLine();
			char[][] P = new char[r][c];
			for(int i=0;i<r;i++)
			{
				String s = sc.nextLine();
				for(int j=0;j<c;j++)
				{
					P[i][j] = s.charAt(j);
				}
			}
			boolean found = false;
			int k=0;
			for(int i=0;i<=R-r;i++)
			{
				int m=0;
				for(int j=0;j<=C-c;j++)
				{
					if(G[i][j]==P[k][m])
					{
						found = check(i,j,G,P);
						if(found)
						{
							break;
						}
					}
					else
					{
						
					}
				}
				if(found)
				{
					break;
				}
			}
			if(found)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
			
		}
	}

	private static boolean check(int m, int n, char[][] g, char[][] p) {
		// TODO Auto-generated method stub
		boolean found = true;
		int k=0;
		for(int i=m;i<=m+p.length-1;i++)
		{
			int l=0;
			for(int j=n;j<=n+p[0].length-1;j++)
			{
				//System.out.println(k+"  "+l );
				if(g[i][j]!=p[k][l])
				{
					found = false;
					break;
				}
				l++;
			}
			k++;
			if(!found)
			{
				break;
			}
		}
		if(!found) return false;
		else return true;
	}

}

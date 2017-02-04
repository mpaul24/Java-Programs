package codechef;

import java.util.Arrays;
import java.util.Scanner;


public class Solution {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long l = sc.nextLong();
		long r = sc.nextLong();
		long[] num = new long[n];
		for(int i=0;i<n;i++)
		{
			num[i] = sc.nextLong();
		}
		Arrays.sort(num);
		
		long max = num[n-1]+num[n-2];
		if(r<max) max =r;
		else  max = max-1;
		
		long min = max;
		
		for(int i=n-1;i>0;i--)
		{
			long x = (num[i]-num[i-1]);
			long y = (num[i]+num[i-1]);
			if(x<min)
			{
				if(y>=min)
				{
					min = y;
					if(l>min) min = l;
					else  min = min+1;
				}
			}
		}

		
	}

}

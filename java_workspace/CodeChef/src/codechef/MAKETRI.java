package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class MAKETRI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(Long.MAX_VALUE+"\n"+Double.MAX_VALUE);
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
		long ans = 0;
		long max = num[n-1]+num[n-2];
		if(r<max) max =r;
		else  max = max-1;
		
		long min = max+1;
		//long[] array = new long[1000010];
		//int count =0 ;
		boolean f = false;
		for(int i=n-1;i>=1;i--)
		{
			if((num[i]-num[i-1])<min){
				f = true;
				long temp = (num[i]-num[i-1]);
				
				if((num[i]+num[i-1])>min)
				{
					//System.out.println(max+"   "+min);
					//System.out.println("Hello"+ans);
					min = temp;
					if(l>min) min = l;
					else  min = min+1;
				}
				else
				{
					
					if(max<min) ;	
					else ans += max-min+1;
					//System.out.println(max+"   "+min);
					//System.out.println("World"+ans);
					//max = min;
					max = num[i]+num[i-1];
					if(r<max) max =r;
					else  max = max-1;
					
					min = (num[i]-num[i-1]);
					if(l>min) min = l;
					else  min = min+1;
					f = true;
					
				}
			}
			
			//System.out.println(count+" "+min+" "+num[i]);
		}
		if(f){
		if(max<min) ;	
		else ans += max-min+1;
		}
		
		
		System.out.println(ans  );
		
	}

}
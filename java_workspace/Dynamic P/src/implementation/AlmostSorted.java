package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class AlmostSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		int[] temp = new int[size];
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
			array[i] = array[i];
		}
		Arrays.sort(array);
		int from=-1,to=-1;
		boolean not =false;
		for(int i=0;i<size;i++)
		{
			 if(from<0)
			{
				if(array[i]!=temp[i]) from =i;
			}
			else if(to<0)
			{
				if(array[i]!=temp[i]) to=i;
			}
			else if(to>0)
			{
				if(array[i]!=temp[i]) {
					not = true;
					break;
				}
			}
		}
		if(not){
			System.out.println("no");
		}
		else
		{
			
		}
		/*boolean n = false;
		boolean not = false;
		int reverse_from=-1,reverse_to=-1,swap_from=-1,swap_to=-1;
		int reverse=-1,swap=-1;
		for(int i=0;i<size;i++)
		{
			//System.out.println(array[i]+" "+reverse_from+" "+n+" "+not);
			for(int j=i+1;j<size;j++)
			{
				if(array[i]>array[j])
				{
					if(!n)
					{
						swap=1;
						if(reverse_from!=-1)
						{
							swap_from=-1;swap_to=-1;
							swap=-1;
						}
						reverse_from = i;
						reverse_to = j;
						if(swap==1){
						swap_from = i;
						swap_to = j;
						reverse =1;}
					}
					else
					{
						not = true;
						break;
					}
				}
				else
				{
					if(reverse_from>0) n=true;
				}
				if(j==size-1 && reverse==1 && i==reverse_from)
				{
					i=reverse_to;
				}
			}
			if(not)
			{
				break;
			}
			
		}
		if(not)
		{
			System.out.println("no");
		}
		else
		{
			
			if(swap==1)
			{
				System.out.println("yes\nswap "+(swap_from+1)+" "+(swap_to+1));
			}
			else if(reverse==1)
			{
				boolean l =false;
				for(int i=reverse_from+1;i<=reverse_to;i++)
				{
					if(i==reverse_to)
					{
						if(array[i-1]<array[i]) 
						{
							l = true;
							break;
						}
					}
					else{
						if(array[i-1]<array[i] || array[i]<array[i+1])
						{
							l=true;
							break;
						}
					}
				}
				if(!l)
				{
					System.out.println("yes\nreverse "+(reverse_from+1)+" "+(reverse_to+1));
				}
				else
				{
					System.out.println("no");
				}
				
			}
			else
			{
				System.out.println("yes");
			}
		}
	*/
	}

}

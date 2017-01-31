package codechef;

import java.util.Scanner;

public class ANKPAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int Q = sc.nextInt();
		for(int tt=0;tt<Q;tt++)
		{
			boolean notPalindrome = false;
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			int k = sc.nextInt()-1;
			int l = sc.nextInt()-1;
			if(j<k)
			{
				int y=l;
				char[] set = s.toCharArray();
				for(int x=k;x<=(l+k)/2;x++)
				{
					//System.out.println(set[x]+"  "+set[y]);
					if(set[x]!=set[y])
					{
						notPalindrome = true;
						break;
					}
					y--;
				}
			}
			else{
				int y = j;
				char[] set = s.toCharArray();
				for(int x=i;x<=(j+i)/2;x++)
				{
					char temp = set[x];
					set[x] = set[y];
					set[y] = temp;
					y--;
				}
				y=l;
				for(int x=k;x<=(l+k)/2;x++)
				{
					//System.out.println(set[x]+"  "+set[y]);
					if(set[x]!=set[y])
					{
						notPalindrome = true;
						break;
					}
					y--;
				}
			}
			if(notPalindrome)
			{
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}
		}
	}

}

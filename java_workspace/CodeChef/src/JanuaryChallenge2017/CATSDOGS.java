package JanuaryChallenge2017;

import java.util.Scanner;

public class CATSDOGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Integer.MAX_VALUE+"   "+Long.MAX_VALUE+"  "+Double.MAX_VALUE);
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int tt=0;tt<test;tt++)
		{
			long C = sc.nextLong();
			long D = sc.nextLong();
			long L = sc.nextLong();
			if(L<(D*4))
			{
				System.out.println("no");
			}
			else if(L>(D*4+C*4))
			{
				System.out.println("no");
			}
			else
			{
				if((2*D)>=C)
				{
					if(L>=(D*4) && L<=(D*4+C*4) && L%4==0)
					{
						System.out.println("yes");
					}
					else
						System.out.println("no");
				}
				else
				{
					if(L>=(D*4+(C-2*D)*4) && L<=(D*4+C*4) && L%4==0)
					{
						System.out.println("yes");
					}
					else
						System.out.println("no");
				}
			}
		}
	}

}

package JanuaryChallenge2017;

import java.util.Scanner;

public class Daulat {
	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//System.out.println(Integer.MAX_VALUE);
		int test = sc.nextInt();
		for(int tt=0;tt<test;tt++)
		{
			double f0 = sc.nextDouble();
			double f1 = sc.nextDouble();
			double N = sc.nextDouble();
			f1 = Math.pow((f1+1), N-1)+Math.pow((f0+1), N-2);
			/*for(int i=2;i<=N;i++)
			{
				double temp = f1;
				f1 = f0+f1*(1+f0);
				f1 = f1%(1000000000+7);
				f0=temp;
			}*/
			//f1 = f1%(1000000000+7);
			System.out.println(f1-1);
		}
	}

}

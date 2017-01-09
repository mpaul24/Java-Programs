package implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	
	static void factorial(long num)
	{
		//long fact=1;
		BigInteger fact = new BigInteger("1");
		for(long i=num;i>0;i--)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

	public static void main(String args[])
	{
		long num;
		//BigInteger bigInteger = new BigInteger("100000000000000000000000000000000");
		//bigInteger = bigInteger.multiply(bigInteger);
		//System.out.println(bigInteger);
		Scanner sc = new Scanner(System.in);
		num = sc.nextLong();
		factorial(num);
	}
}

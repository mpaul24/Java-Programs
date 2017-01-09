package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class BiggerGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test;
		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();
		sc.nextLine();
		while(test>0)
		{
			//sc.next();
			String input = sc.nextLine();
			//System.out.println(input);
			lexiString(input);
			test--;
		}
	}

	private static void lexiString(String input) {
		// TODO Auto-generated method stub
		char[] array = input.toCharArray();
		int value=-1;
		int t =0;
		int from = 0;
		//System.out.println(input);
		for(int i=array.length-1;i>=t;i--)
		{
			//System.out.println(array[i]+" "+array[i-1]);
			for(int j=i;j>=t;j--)
			{
				//System.out.println(array[i]+" "+array[j]);
				if(array[i]>array[j])
				{
					t=j+1;
					from=i;
					value = j;			
					
					//break;
				}	
			}
			//if(value>=0) break;
		}
		if(value>=0){
			char temp = array[t-1];
			array[t-1] = array[from];
			array[from] = temp;
			//System.out.println(new String(array));
		Arrays.sort(array, value+1, array.length);
		System.out.println(new String(array));
		}
		else{
			System.out.println("no answer");
		}
		
	}

}

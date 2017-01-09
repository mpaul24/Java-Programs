package implementation;

import java.util.Scanner;

public class Encryption {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int length = input.length();
		double row = (long)Math.sqrt(length);
		double column = row;
		if(row!=Math.sqrt(length))
		{
			column = row+1;
		}
		//long column = Math.
		//System.out.println(row+"  "+column);
		input.toCharArray();
		int col = (int)column;
		int r = (int)row;
		String[] ans = new String[col];
		for(int i=0;i<length;i++)
		{
			int x = i%col;
			//System.out.println(input.charAt(i));
			if(i>=0 && i<col) ans[x] = String.valueOf(input.charAt(i));
			else ans[x] = ans[x]+String.valueOf(input.charAt(i));
		}
		for(int i=0;i<col;i++)
		{
			System.out.print(ans[i]);
			if(i!=col-1)
				System.out.print(" ");
		}
		
	}

}

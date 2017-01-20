package JanuaryChallenge2017;

import java.util.Scanner;

public class RESERVOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		String[] a = new String[test];
		for(int tt=0;tt<test;tt++)
		{
			int N,M;
			N = sc.nextInt();
			M = sc.nextInt();
			
			boolean notPossible = false;
			
			sc.nextLine();
			String prev = null;
			for(int z=0;z<N;z++){
				
				String line = new String();
				if(sc.hasNextLine()) line = sc.nextLine();
				if(!notPossible){
					for(int i=0;i<line.length();i++)
					{
						//System.out.println(i+"   inner  ");
						if(line.charAt(i)=='W')
						{
							if(i==0 || i==line.length()-1){
								notPossible = true;
								break;
							}
							else{
								if(prev!=null){
								if((line.charAt(i-1)=='B' || line.charAt(i-1)=='W') && (line.charAt(i+1)=='B' || line.charAt(i+1)=='W') && prev.charAt(i)!='B') ;
								else 
								{
									notPossible = true;
									break;
								}
								}
								else
								{
									if((line.charAt(i-1)=='B' || line.charAt(i-1)=='W') && (line.charAt(i+1)=='B' || line.charAt(i+1)=='W') ) ;
									else 
									{
										notPossible = true;
										break;
									}
									
								}
							}
						}
						else if(line.charAt(i)=='A')
						{
							if(prev!=null){
								if(prev.charAt(i)=='W' || prev.charAt(i)=='B')
								{
									notPossible = true;
									break;
								}
							}
						}
					}
				}
				prev = new String(line.toCharArray());
			}
			if(notPossible)
			{
				a[tt]="no";
				//System.out.println("no");
			}
			else
			{
				a[tt]="yes";
				//System.out.println("yes");
			}
		}
		sc.close();
		//sc.nextLine();
		for(int i=0;i<test;i++)
		{
			System.out.println(a[i]);
		}
	}

}

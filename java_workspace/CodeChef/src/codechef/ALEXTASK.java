package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class ALEXTASK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0;i<test;i++){
			int sensor = sc.nextInt();
			int[] freq = new int[sensor];
			for(int j=0;j<sensor;j++){
				freq[j] = sc.nextInt();
			}
			checkFreeze(freq);
			
		}
	}

	static void checkFreeze(int[] freq) {
		// TODO Auto-generated method stub
		Arrays.sort(freq);
		int variable = freq.length;
		
			int ans =0;
			boolean flag = false;
			for(int i=0;i<variable;i++){
				for(int j=i+1;j<variable;j++){
					if(freq[j]%freq[i] == 0){
						flag = true;
						variable = j;
						ans = freq[j];
						i=j-1;
						if(freq[0]*freq[1] < ans){
							ans = freq[0]*freq[1];
						}
						break;
					}
				}
			}
			if(flag){
				System.out.println(ans);
			}
			else{
				ans = freq[0]*freq[1];
				System.out.println(ans);
			}
		}
		
	

}

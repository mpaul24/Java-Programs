package codechef;

import java.io.*;
import java.util.*;

public class Solution {
	static long[][][] matrix;
	static HashMap<String,Long> hashMap = new HashMap<String,Long>();
	
	static void update(int x , int y, int z, long w){
		matrix[x][y][z] = w;
		hashMap.put(x+"-"+y+"-"+z, w);
	}
	
	static void query(int x1 , int y1, int z1, int x2 , int y2, int z2){
		long sum = 0;
		Set set = hashMap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Map.Entry mentry = (Map.Entry)iterator.next();
			String[] value = mentry.getKey().toString().split("-");
			int x = Integer.parseInt(value[0]);
			int y = Integer.parseInt(value[1]);
			int z = Integer.parseInt(value[2]);
			if(((x<=x2 && x>=x1) && (y<=y2 && y>=y1) && (z<=z2 && z>=z1)) || ((x<=x1 && x>=x2) && (y<=y1 && y>=y2) && (z<=z1 && z>=z2))){
				sum = sum + Long.parseLong(mentry.getValue().toString());
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0;i<test;i++){
			hashMap.clear();
			int size = sc.nextInt();
			size = size +1;
			int operartion = sc.nextInt();
			matrix = new long[size][size][size];
			sc.nextLine();
			for(int j=0;j<operartion;j++){
				
				String l = sc.nextLine();
				String[] a = l.split(" ");
				String queries = a[0];
				//System.out.println(queries+"hjbbjb");
				
				if(queries.toLowerCase().equals("update")){
					int x = Integer.parseInt(a[1]);
					int y = Integer.parseInt(a[2]);
					int z = Integer.parseInt(a[3]);
					long w = Long.parseLong(a[4]);
					//System.out.println(x+" "+y+" "+z+" "+w);
					update(x,y,z,w);
				}
				else{
					int x1 = Integer.parseInt(a[1]);
					int y1 = Integer.parseInt(a[2]);
					int z1 = Integer.parseInt(a[3]);
					int x2 = Integer.parseInt(a[4]);
					int y2 = Integer.parseInt(a[5]);
					int z2 = Integer.parseInt(a[6]);
					//System.out.println(x1+" "+y1+" "+z1+" "+x2);
					query(x1,y1,z1,x2,y2,z2);
				}
			}
		}
		
	}

}

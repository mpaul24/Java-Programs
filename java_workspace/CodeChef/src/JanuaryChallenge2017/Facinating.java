package JanuaryChallenge2017;
import java.util.*;
import java.util.Map.Entry;

public class Facinating {
	//static HashMap<Double,Double> map = new HashMap<>();
	static final Map<Double,Double> map;
	//static int sas=0,ss;
	// Function to print the divisors
	static double s = 0;
	
	static{
		map = new HashMap<Double,Double>();
		int max = 0;
		for(double n=1;n<10000000;n++)
		{
			double count = 0;
		    // Note that this loop runs till square root
		    for (int i=1; i<((int)Math.sqrt(n)+1); i++)
		    {
		        if (n%i==0)
		        {
		            // If divisors are equal, print only one
		            if (n/i == i)
		                count++;
		 
		            else // Otherwise print both
		                count += 2;
		        }
		    }
		    //System.out.println(count);
		    if(max<count) max = (int) count;
		    double m =  Math.pow(n, count);
		    map.put(m, n);
		    s = m;
		    //System.out.println(map.get(m)+"  "+m);
			//System.out.println(map.get(m)+"  "+m);
		}
		System.out.println(max);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Entry< Double, Double> > set = map.entrySet();
		
		//System.out.println(Math.sqrt(2));
		Scanner s = new Scanner(System.in);
		//map.put(1, 100);
        int N = s.nextInt();
        for(int i=0;i<100;i++)
        {
        	System.out.println(map.get(i));
        }

        /*for (int i = 0; i < N; i++) {
            int X = s.nextInt();
            if(map.get(X)!=null)
            {
            	System.out.println(map.get(X));
            }
            else{
            	System.out.println("-1");
            }
            
        }*/
	}

}

import java.util.*;
public class Guess_It {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	
	long a,m;
	
	while(t-->0)
	{
		a=sc.nextLong();
		m=sc.nextLong();
	
		ArrayList<Long> x=new ArrayList<>();
		long q,d,n;
		/*
		The equation is:-- M=A.N+d  , N=qd , q must be an Integer. M=A.q.d+d d=(M/(Aq+1) factors of M are:- f1,f2.... fi..
		Let's fi=Aq+1 So,(fi-1)/A =q; In order to make Q an integer , (fi-1)/A=q;
		Aq+1 is also a divisor of M. d=Aq+1. Therefore , (d-1)/A=q . 
	Compute , the number we are guessing (N) =q.d. Add it to the list. And then sort the list. And print the list by excluding 0.
	    
		
		
		
		*/
		for(long i=1;i*i<=m;i++)
		{
			if(m%i==0)
			{
				d=(m/i);
				if((i-1)%a==0)
				{
					q=(i-1)/a;
					
					n=q*d;
					x.add(n);
				}
				if((d-1)%a==0)
				{
					q=(d-1)/a;
					n=q*i;
					x.add(n);
				}
				
			}
		}
		System.out.println(x.size()-1);
		Collections.sort(x);
		for(int i=1;i<x.size();i++)
			System.out.print(x.get(i)+" ");
		System.out.println();
	}
}
}

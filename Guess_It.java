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

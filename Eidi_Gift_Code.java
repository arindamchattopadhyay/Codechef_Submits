/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0)
	{
		ArrayList<Integer> ob1=new ArrayList<>();
		ArrayList<Integer> ob2=new ArrayList<>();
		
		for(int i=0;i<3;i++)
		{
			ob1.add(sc.nextInt());
		}
		for(int i=0;i<3;i++)
		{
			ob2.add(sc.nextInt());
			
		}
	
	
		TreeMap<Integer,Integer> ob3=new TreeMap<Integer,Integer>();
		int k=1;
		for(int i=0;i<3;i++)
		{
			if(ob3.containsKey(ob1.get(i)))
			{
				if(ob2.get(i)!=ob3.get(ob1.get(i))){
					System.out.println("NOT FAIR");
					k=0;
					break;
					
				}
			}
			else

			ob3.put(ob1.get(i),ob2.get(i));

		}
		if(k!=0){
		//System.out.println(ob3);
		Set<Map.Entry<Integer,Integer>>  x=ob3.entrySet();
		int p=Integer.MIN_VALUE,c=0;
	//nt p1=Integer.MIN_VALUE;
		for(Map.Entry<Integer,Integer> d:x)
		{
			//System.out.println("Value "+d.getValue());
			if(d.getValue()>p) {
				p=d.getValue();
				c++;
			}

			else {
				System.out.println("NOT FAIR");break;}
		}
		
		if(c==ob3.size())
			System.out.println("FAIR");
		
		
		
	 }
	 t--;
	}
	}
}

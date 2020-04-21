/* package codechef; // don't place package name! */
//https://www.codechef.com/APRIL20B/problems/SQRDSUB/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
/* Name of the class has to be "Main" only if the class is public. */
class FastReader {

    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;

    FastReader(InputStream is) {
        in = is;
    }

    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }

    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }

    String nextLine() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c != 10 && c != 13; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }

    char nextChar() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        return (char) c;
    }

    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }

    long nextLong() throws IOException {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
   


    long[] getLongArray(int size) throws Exception {
        long[] ar = new long[size];
        for (int i = 0; i < size; ++i) ar[i] = nextLong();
        return ar;
    }

   int[] getIntArray(int size) throws Exception {
        int[] ar = new int[size];
        for (int i = 0; i < size; ++i) ar[i] = nextInt();
        return ar;
    }

    String[] getStringArray(int size) throws Exception {
        String[] ar = new String[size];
        for (int i = 0; i < size; ++i) ar[i] = next();
        return ar;
    }
}


class Codechef
{
static long subCount(long a[], int n) 
    { 
        long before=0,nos=0;
        for(int i=0;i<=n-1;i++)
        {
            if(a[i]==0)
                before++;
            else if(a[i]==1)
                {
                    long after=1;
                    before++;
                    i++;
                    while(i<=n-1&&a[i]==0)
                    {
                        after++;
                        i++;
                    }
                    i--;
                    nos+=(long)before*(long)after;
                    before=after;
                    before--;
                }
            else
                before=0;
        }
        return nos;
        
    } 
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc=new FastReader(System.in);
		StringBuilder sb=new StringBuilder();
		PrintWriter pw=new PrintWriter(System.out);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    long a[]=new long[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextLong();
		        if(Math.abs(a[i]%2)==1)
		            a[i]=0;
		        else if(a[i]%4==0)
		            a[i]=2;
		        else
		            a[i]=1;
		    }
		    long total=(long)n*(long)(n+1)/2;
		    sb.append(total-subCount(a,n)).append("\n");
		}
		pw.println(sb);
		pw.flush();
		
	}

}
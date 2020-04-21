/* package codechef; // don't place package name! */
//https://www.codechef.com/APRIL20B/problems/ANSLEAK/
import java.util.*;
import java.lang.*;
import java.io.*;

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
   


}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 FastReader sc=new FastReader(System.in);
		 StringBuilder sb=new StringBuilder();
		 PrintWriter pw=new PrintWriter(System.out);
	     int t=sc.nextInt();
	     while(t-->0){
	         long n=sc.nextLong();
	         int m=sc.nextInt();
	         long k=sc.nextLong();
	         
	         
	         for(int i=0;i<n;i++)
	         {
	             int arr[]=new int[m+1];
	             for(int j=0;j<k;j++)
	             {
	                 int a=sc.nextInt();
	                 arr[a]++;
	             }
	             int max=-1,res=0;
	             for(int x=1;x<=m;x++)
	             {
	                 if(max<arr[x]){
	                    res=x;
	                    max=arr[x];
	                 }
	                 
	             }
                sb.append(res+" ");
	        }
	         sb.append("\n");
	     }
	     pw.println(sb);
	     pw.flush();
	}

}

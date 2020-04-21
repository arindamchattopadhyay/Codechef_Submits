/* package codechef; // don't place package name! */
//https://www.codechef.com/APRIL20B/problems/STRNO/
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
    static boolean isPossible(int n, int k) 
    {
        ArrayList<Integer> P = new ArrayList<Integer>(); 
  
      while (n % 2 == 0) 
        { 
            P.add(2); 
            n /= 2; 
        } 
  
        for (int i = 3; i * i <= n; i = i + 2) 
        { 
            while (n % i == 0) 
            { 
                n = n / i; 
                P.add(i); 
            } 
        } 
  
        if (n > 2) 
             P.add(n); 
  
        if (P.size() < k) 
        { 
            return false; 
        } 
    return true;
    
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
		    int x=sc.nextInt();
		    int k=sc.nextInt();
            if(isPossible(x,k))
		        sb.append("1").append("\n");
		    else
		        sb.append("0").append("\n");
		}
		pw.println(sb);
		pw.flush();
	}
}

import java.util.*;
import java.lang.*;
import java.io.*;

public class ParityAgain{
	public static void main (String[] args) throws java.lang.Exception{
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int e=0;
            int o=0;
            int q = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<q;i++){
                int x = sc.nextInt();
                if(set.contains(x)){
                   sb.append(e+" "+o+"\n");
                   continue; 
                }
                e=0;o=0;
                if(!set.isEmpty()){
                    List<Integer> list = new ArrayList<>();
                    for(int num : set)
                        list.add(num^x);
                    for(int num : list)
                        set.add(num);
                }
                set.add(x);
                for( int num : set){
                    if(Integer.bitCount(num)%2==0)
                        e++;
                    else
                        o++;
                }
                sb.append(e+" "+o+"\n");
            }
        }  
        System.out.println(sb.toString());
	}
}



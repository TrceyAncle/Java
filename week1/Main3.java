package week1;

import java.util.Scanner;

public class Main{
	 
	   public static void main(String[] args){

	      Scanner a = new Scanner(System.in);
	      while(a.hasNextLine()) {
	      String x = a.nextLine();
	      char[] s=x.toCharArray();
	      int m=0;
	      for (int i = 0; i < s.length; i++) {
			if(s[i]=='-'||s[i]=='.')
				continue;
			m=m+Integer.parseInt(String.valueOf(s[i]));
		}
	      
	    System.out.println(m);  
	      }	
	   }
}

/*
import java.util.Scanner;

public class Main{
	 
	   public static void main(String[] args){

	      Scanner a = new Scanner(System.in);
	      double x = a.nextDouble();
	      if(x<0)
	    	  x=-x;
	      String y = String.valueOf(x);
	      String[] z = y.split("\\.");
	      String s = z[0]+z[1];
	      char[] m = s.toCharArray();
	      int n = 0;
	      for (int i = 0; i < m.length; i++) {
			    n = n+Integer.parseInt(String.valueOf(m[i]));
	      }
	      System.out.println(n);
 }	 
}
*/
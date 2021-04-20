package week1;

import java.util.Scanner;

public class Main2{
	 
	   public static void main(String[] args){

	      Scanner in = new Scanner(System.in);
	      
	      while(in.hasNextInt()) {
		  
	      int x=in.nextInt();
	      
	      if( x<=20000&x>=10000 ){
	    	  
	         System.out.println(Integer.toBinaryString(x)+","+Integer.toOctalString(x)+","+Integer.toHexString(x));
	  
	      }else {
	    	  if(x<0) {
	    		  x=-x;
	    	  }
	    	  String y=Integer.toString(x);
	    	  char[] a=y.toCharArray();
	    	 // System.out.println(a[0]);
	    	  int s = 0;
	    	  for(int i = 0;i<a.length;i++) {
	    		  System.out.print(a[i]+" ");
	    		  s = s + Integer.parseInt(String.valueOf(a[i]));
	    	  } 
	    	  System.out.println(s);
	      }
	      }
	   }
	}
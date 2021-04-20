package week1;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args){

	      Scanner in = new Scanner(System.in);
	      
	      while(in.hasNextInt()) {
		  
	      int a=in.nextInt();
	      int b=in.nextInt();
	    		  
	 
	      if( a<=1000&b<=1000 ){
	    	  
	         System.out.println(a+b);
	      }else {
	    	  System.out.print("a<=1000");
	      }
	      }
	   }
}

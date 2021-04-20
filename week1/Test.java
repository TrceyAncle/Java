package week1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){

	      Scanner in = new Scanner(System.in);
	      
	      while(in.hasNextDouble()) {
	      double x=in.nextDouble();
	      if(x<0)
	    	  System.out.println("NaN");
	      else {
	    	  for(double n=0;n<x;) {
	    		  if(x-Math.pow(n,2)<0.0001) {
	    			  System.out.printf("%.6f\n",n);
	    			  break;
	    		  }		
	    		  else
	    			  n=n+0.0001;
	    	  }
	    		  
	    	  
	      	}
	    }
	}
}

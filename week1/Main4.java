package week1;

import java.util.Scanner;

public class Main4{
	public static void main(String[] args){

	      Scanner in = new Scanner(System.in);
	      
	      while(in.hasNextDouble()) {
	      double x=in.nextDouble();
	      if(x<0)
	    	  System.out.println("NaN");
	      else if(x==0)
	    	  System.out.printf("%.6f\n",x);
	      else if(x<1){
	    	  for(double n=0;n<2;) {
	    		  if(x-Math.pow(n,2)<0.0001) {
	    			  System.out.printf("%.6f\n",n);
	    			  break;
	    		  }		
	    		  else
	    			  n=n+0.0001;
	    	  } 
	      	}
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

//for(double n=1;n>x;) {
//	  if(Math.pow(n,2)-x<0.0001) {
//		  System.out.printf("%.6f\n",n);
//		  break;
//	  }		
//	  else
//		  n=n-0.0001;
//} 
//

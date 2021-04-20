package week1;

import java.util.Scanner;

public class Main5 {
	   public static void main(String[] args){

		      Scanner a = new Scanner(System.in);
		      int x =a.nextInt();
		      if(x==0)
		    	  System.out.println("32");
		      else {
		      String y = Integer.toBinaryString(x);
		      char[] m = y.toCharArray();
		      System.out.println(32-m.length);
		      }
	 }	 
}

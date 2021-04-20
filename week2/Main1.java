package week2;
import java.util.Scanner;

public class Main1{
	public static void main(String[] args){

	      Scanner in = new Scanner(System.in);
	      while(in.hasNextInt()) {
	      int n=in.nextInt();
	      int x=in.nextInt();
	      int y=in.nextInt();
	      StringBuilder str = new StringBuilder("");
	      for (int i = 0; i < n; i++) {
	    	  str.append(i);
		}
	      String a = str.substring(x,y);
	      System.out.println(a);
	  }
	}
}


//while(in.hasNextInt()) {
//    int n=in.nextInt();
//    int x=in.nextInt();
//    int y=in.nextInt();
//    String str="";
//    for (int i = 0; i < n; i++) {
//  	  str = str+String.valueOf(i);
//	}
//    char[] a=str.toCharArray();
//    for (int i = x; i < y; i++) {
//		System.out.print(a[i]);
//	}

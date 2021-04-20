package week2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			while(true) {
			String a=in.nextLine();
			String b=in.nextLine();
			BigDecimal x=new BigDecimal(a);
			BigDecimal y=new BigDecimal(b);
			System.out.println(x.add(y));
			System.out.println(x.multiply(y));
			
		  }
		}
}

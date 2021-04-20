package week2;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] c=null;
	while(true) {
		String choice = sc.nextLine();
		switch (choice) {
		case "fib":
			int n = Integer.parseInt(sc.nextLine());
			fib(n);
			break;
		case "sort":
			String a=sc.nextLine();
			String[] b=a.split(" ");
			c=convertToIntDigits(b);
			Arrays.sort(c);
			System.out.println(Arrays.toString(c));
			break;
		case "search":
			Arrays.sort(c);
			int a1=Integer.parseInt(sc.nextLine());
			int b1=Arrays.binarySearch(c, a1);
			if(b1<0)
				System.out.println(-1);
			else
				System.out.println(b1);
			break;
		case "getBirthDate":
			int n1 = Integer.parseInt(sc.nextLine());
			String[] str=new String[n1];
			for (int i = 0; i < n1; i++) {
				str[i]=sc.nextLine();
			}
			for (int i = 0; i < n1; i++) {
				System.out.println(str[i].substring(6, 10)+"-"+str[i].substring(10, 12)+"-"+str[i].substring(12, 14));
			}
			break;
		default:
			System.out.println("exit");
			System.exit(0);
			break;
		}
		}
	}

	private static int[] convertToIntDigits(String[] b) {
		int[] c=new int[b.length];
		for (int i = 0; i < c.length; i++) {
			c[i]=Integer.parseInt(b[i]);
		}
		return c;
	}

	private static void fib(int n) {
//		int a=1,b=1;
//		int c=a+b;
//		int d=b+c;
//		for (; d<n; ) {
//			a=b;
//			b=c;
//			c=a+b;
//			d=b+c;
//		}
//		System.out.println(a+" "+b+" "+c);
		int a=1,b=1;
		for (int i = 1; i < n; i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);	
	}

}

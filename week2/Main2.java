package week2;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] str=new String[n];
		for (int i = 0; i < n; i++) {
			str[i]=sc.next();
		}
	while(true) {
		String choice = sc.next();
		switch (choice) {
		case "sort1":
			String temp="";
			int a=0;
			for (int i = 0; i < n-1; i++) {
				for (int j = 0; j < n-i-1; j++) {
					a=(str[j].substring(6, 14)).compareTo(str[j+1].substring(6, 14));
					if(a>0) {
						temp= str[j];
						str[j]=str[j+1];
						str[j+1]=temp;
					}
				}	
			}
			for(int i=0;i<n;i++)
            {
                System.out.println(str[i].substring(6,10)+"-"+str[i].substring(10,12)+"-"+str[i].substring(12,14));
            }
			break;
		case "sort2":
			int b=0;
			for (int i = 0; i < n-1; i++) {
				for (int j = 0; j < n-i-1; j++) {
					b=(str[j].substring(6, 14)).compareTo(str[j+1].substring(6, 14));
					if(b>0) {
						temp= str[j];
						str[j]=str[j+1];
						str[j+1]=temp;
					}
				}	
			}
			for(int i=0;i<n;i++)
            {
                System.out.println(str[i]);
            }
			break;
		default:
			System.out.println("exit");
			System.exit(0);
			break;
		}
		}
	}
}

package week4;

import java.util.Scanner;

public class Main62 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		Object[] object =new Object[n];
		for (int i = 0; i < n; i++) 
		{
			String choice = sc.next();
			switch (choice) 
			{
				case"c":
					object[i] = new Computer();
					break;
				case"d":
					object[i] = new Double(sc.nextDouble());
					break;
				case"i":
					object[i] = new Integer(sc.nextInt());
					break;
				case"s":
					object[i] = sc.next();
					break;
				default:
					object[i]=null;
					break;
			}
		}
		for(int j=object.length-1;j>=0;j--)
		{
			if(object[j]!=null)
			{
	    		System.out.println(object[j]);
	    	}
	    	else continue;
	    }
		sc.close(); 
	}
}

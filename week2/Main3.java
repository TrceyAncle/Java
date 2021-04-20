package week2;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
		int n = sc.nextInt();
		String[][] str = getDynamicMatrix(n);
		for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if (j==i)
                    System.out.println(str[i][j]);
                else
                    System.out.printf("%-7s",str[i][j]);
            }
        }
		System.out.println(Arrays.deepToString(str));
	}}

	private static String[][] getDynamicMatrix(int n) {
		String[][] strs = new String[n][];
		
		for (int i = 0; i < n; i++) {
			strs[i] = new String[i+1];
			for(int j=0;j<=i;j++)
            {
                strs[i][j]=(i+1)+"*"+(j+1)+"="+(i+1)*(j+1);
            }
		}
		return strs;
	}
	
}

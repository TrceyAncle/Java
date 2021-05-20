package week5;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		ArrayIntegerStack ints = new ArrayIntegerStack(n);
		int m=Integer.parseInt(in.nextLine());
		for (int i = 0; i < m; i++) 
		{
			System.out.println(ints.push(in.nextInt()));
		}
		System.out.print(ints.peek() + "," + ints.empty() + "," + ints.size());
		System.out.println("");
		System.out.println(Arrays.toString(ints.getInts()));
		int x=in.nextInt();
		for (int i = 0; i < x; i++) 
		{
			System.out.println(ints.pop());
		}
		System.out.print(ints.peek() + "," + ints.empty() + "," + ints.size());
		System.out.println();
		System.out.println(Arrays.toString(ints.getInts()));
	}
}

interface IntegerStack
{
	public Integer push(Integer item);
	public Integer pop();
	public Integer peek();
	public boolean empty();
	public int size();
}

class ArrayIntegerStack implements IntegerStack
{
	private Integer[] ints;
	int a=0;
	
	public ArrayIntegerStack(int n) 
	{
		ints = new Integer[n];
	}
		
	public Integer[] getInts() {
		return ints;
	}

	public void setInts(Integer[] ints) {
		this.ints = ints;
	}

	@Override
	public Integer push(Integer item) 
	{
		if(item == null) 
			return null;
		if(this.size()==ints.length)
			return null;
		ints[a++]=item;
		return item;
		
	}

	@Override
	public Integer pop() 
	{
		if(a==0)
			return null;
		return ints[--a];
	}

	@Override
	public Integer peek() 
	{
		if(a==0)
			return null;
		return ints[a-1];
	}

	@Override
	public boolean empty() 
	{
		if (a == 0) 
			return true; 
		return false;
	}

	@Override
	public int size() 
	{
		return a;
	}
	
}
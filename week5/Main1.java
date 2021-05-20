package week5;

import java.util.Arrays;
import java.util.Scanner;

public class Main1
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		PersonSortable2[] persons=new PersonSortable2[n];
		for (int i = 0; i < n; i++) 
		{
			persons[i] = new PersonSortable2(in.next(), in.nextInt());
		}
		Arrays.sort(persons);
		for (PersonSortable2 e : persons) 
		{
			System.out.println(e);
		}
		System.out.println(Arrays.toString(PersonSortable2.class.getInterfaces()));
	}
}

class PersonSortable implements Comparable<PersonSortable2>
{
	private String name;
	private int age;

	public PersonSortable(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString() 
	{
		return name+"-"+age;
	}
	public int compareTo(PersonSortable2 o)
	{
		if(!name.equals(o.name))
			return name.compareTo(o.name);
		return age-o.age;
	}
}
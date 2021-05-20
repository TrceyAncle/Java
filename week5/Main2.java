package week5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main2
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
		Arrays.sort(persons,new NameComparator());
		System.out.println("NameComparator:sort");
		for (PersonSortable2 e : persons) 
		{
			System.out.println(e);
		}
		Arrays.sort(persons,new AgeComparator());
		System.out.println("AgeComparator:sort");
		for (PersonSortable2 e : persons) 
		{
			System.out.println(e);
		}
		System.out.println(Arrays.toString(NameComparator.class.getInterfaces()));
		System.out.println(Arrays.toString(AgeComparator.class.getInterfaces()));
	}
}

class PersonSortable2
{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PersonSortable2(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString() 
	{
		return name+"-"+age;
	}
}

class NameComparator implements Comparator<PersonSortable2>
{
	public int compare(PersonSortable2 o1, PersonSortable2 o2) 
	{
		return o1.getName().compareTo(o2.getName());
	}
}

class AgeComparator implements Comparator<PersonSortable2>
{
	public int compare(PersonSortable2 o1, PersonSortable2 o2) 
	{
		return o1.getAge()-o2.getAge();
	}
}
package week5;

import java.util.Arrays;

public class Main01 
{
	public static void main(String[] args) 
	{
		Person[] persons=new Person[4];
		persons[0]=new Person("chen",18);
		persons[1]=new Person("zhao",17);
		persons[2]=new Person("wang",17);
		persons[3]=new Person("chen",19);
		Arrays.sort(persons);
		System.out.println(Arrays.toString(persons));
	}
}

class Person implements Comparable<Person>
{
	private String name;
	private int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString() 
	{
		return "[name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Person o)
	{
		if(name!=o.name)
			return name.compareTo(o.name);
		return
			o.age-age;
	}
}
package week3;

import java.util.Scanner;


public class Main2{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		Person[] p=new Person[n];
		for (int i = 0; i < p.length; i++) {
			Person person =new Person(in.next(),in.nextInt(),in.nextBoolean());
			p[i]=person;
			
		}
		for (int i = p.length-1;i>=0; i--) {
			System.out.println(p[i]);
		}
		System.out.println(new Person());
		in.close();
	}
}


class Person 
{
	private String name;
	private int age;
	private boolean gender;
	private int id;
	
	private static int count = 0;

	static 
	{
		System.out.println("This is static initialization block");
	}
	
	
	{
		System.out.printf("This is initialization block, id is %d%n",count);
	}
	
	public Person()
	{
		this.id =count;
		System.out.println("This is constructor");
		System.out.printf("%s,%d,%s,%d%n", name,age,gender,id);
		count++;
	}
	
	public Person(String name,int age, boolean gender) 
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id =count;
		count++;
	}
	
	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public boolean isGender() 
	{
		return gender;
	}

	public void setGender(boolean gender) 
	{
		this.gender = gender;
	}


	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String toString()
	{
		return "Person [name="+name+", age="+age+", gender="+gender+", id="+id+"]";
	}
			
}	



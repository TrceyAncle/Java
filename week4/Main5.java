package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		PersonOverride[] persons1=new PersonOverride[x];
		for (int i = 0; i < x; i++) 
		{
			persons1[i]=new PersonOverride();
		}
		int y=in.nextInt() ;
		PersonOverride[] persons2=new PersonOverride[y];
		int a=1;
		PersonOverride p =new PersonOverride(in.next(),in.nextInt(),in.nextBoolean());
		persons2[0]=p;
		for (int i = 0; i < y-1; i++) 
		{
			int b=0;
			PersonOverride p2 =new PersonOverride(in.next(),in.nextInt(),in.nextBoolean());
			for (int j = 0; j < a; j++) 
			{
				if(persons2[j].equals(p2))
				{
					b=1;
				}
			}
			if(b==0)
			{
				persons2[a]=p2;
				a++;
			}
		}
		for (PersonOverride personoverride : persons1) 
		{
			System.out.println(personoverride);
		}
		for (int i = 0; i < a; i++) 
		{
			System.out.println(persons2[i]);
		}
		System.out.println(a);
		System.out.println(Arrays.toString(PersonOverride.class.getConstructors()));
	}
}

class PersonOverride
{
	private String name;
	private boolean gender;
	private int age;
	public PersonOverride()
	{
		this("default",1,true);
	}
	public PersonOverride(String name, int age, boolean gender) 
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return name+"-"+age+"-"+gender;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonOverride other = (PersonOverride) obj;
		if (age != other.age)
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
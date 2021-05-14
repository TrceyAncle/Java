package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main7 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		Fruit[] fruit = new Fruit[n];
		for (int i = 0; i < n; i++) 
		{
			fruit[i] = new Fruit(in.next());
		}
		for (int i = 0; i < n; i++) 
		{
			if(!fruitList.contains(fruit[i]))
				fruitList.add(fruit[i]);
		}
		for (int i = 0; i < fruitList.size(); i++) 
		{
			System.out.println(fruitList.get(i));
		}
	}
}

class Fruit
{
	private String name;
	public Fruit(String name) 
	{
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]"+"   "+name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equalsIgnoreCase(other.name))
			return false;
		return true;
	}
	
	
}




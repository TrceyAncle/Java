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
		int a=1;
		Fruit f1 = new Fruit(in.next());
		fruitList.add(f1);
		for (int i = 0; i < n-1; i++) 
		{
			int b=0;
			Fruit f2 = new Fruit(in.next());
			for (int j = 0; j < a; j++) 
			{
				if(fruitList.contains(f2))
				{
					b=1;
				}
			}
			if(b==0)
			{
				fruitList.add(f2);
				a++;
			}
		}
		for (int i = 0; i < a; i++) 
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




package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		Shape[] s=new Shape[n];
		int i=0;
		double a=0,b=0;
		while(i<n) 
		{
			String choice = in.next();
			switch (choice) 
			{
				case "rect":
					Rectangle re=new Rectangle(in.nextInt(),in.nextInt());
					s[i]=re;
					i++;
					break;
				case"cir":
					Circle ci =new Circle(in.nextInt());
					s[i]=ci;
					i++;
					break;
				default:
					System.exit(0);
					break;
			}
		}
		for (int j = 0; j < s.length; j++) 
		{
			a=a+s[j].getPerimeter();
			b=b+s[j].getArea();
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(Arrays.deepToString(s));
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j].getClass()+","+s[j].getClass().getSuperclass());
		}
	}
}

abstract class Shape
{
	final double PI=3.14;

	public int width, length,radius;

	public Shape(int width, int length) 
	{
		this.width = width;
	
		this.length = length;
		
	}
	public Shape(int radius) 
	{
		this.radius=radius;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	abstract double getPerimeter() ;

	abstract double getArea() ;
}

class Rectangle extends Shape
{
	public double getPerimeter() 
	{
		return 2*(width+length);
	}
	public double getArea() 
	{
		return width*length;
	}
	public Rectangle(int width,int length)
	{
		super(width,length);
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
}

class Circle extends Shape
{
	public double getPerimeter() 
	{
		return 2*PI*radius;
	}
	public double getArea() 
	{
		return PI*radius*radius;
	}
	public Circle(int radius)
	{
		super(radius);
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
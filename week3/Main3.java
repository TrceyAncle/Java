package week3;

import java.util.Arrays;
import java.util.Scanner;


public class Main3 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		Rectangle[] r=new Rectangle[2];
		Circle[] c=new Circle[2];
		for (int i = 0; i < 2; i++) 
		{
			Rectangle re=new Rectangle( in.nextInt(), in.nextInt());
			r[i]=re;
		}
		for (int i = 0; i < 2; i++) 
		{
			Circle ci=new Circle(in.nextInt());
			c[i]=ci;
		}
		System.out.println(r[0].getPerimeter()+r[1].getPerimeter()+c[0].getPerimeter()+c[1].getPerimeter());
		System.out.println(r[0].getArea()+r[1].getArea()+c[0].getArea()+c[1].getArea());
		System.out.println(Arrays.deepToString(r));
		System.out.println(Arrays.deepToString(c));
	}
}

class Rectangle
{
	private int width;
	private int length;
	
	public Rectangle( int width, int length)
	{
		this.width=width;
		this.length=length;
		
	}
	
	public int getPerimeter()
	{
		return 2*(width+length);
	}
	public int getArea()
	{
		return width*length;
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

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	
	
}

class Circle
{
	private int radius;
	
	public Circle(int radius)
	{
		this.radius=radius;
		
	}
	
	public int getPerimeter()
	{
		return (int) (2*Math.PI*radius);
	}
	
	public int getArea()
	{
		return (int) (Math.PI*radius*radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
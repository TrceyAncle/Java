package week3;

import java.util.Scanner;

public class Main5
{
	private static Scanner sc;
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int v1,v2,i;
		Rational T1;
		Rational T2;
		Rational T3=new Rational();
		T1=new Rational(in.nextInt(),in.nextInt());
        T2=new Rational(in.nextInt(),in.nextInt());
        Rational.Add(T1, T2, T3);
        System.out.println(T3.getV1()+" "+T3.getV2());
        Rational.Multiply(T1, T2, T3);
        System.out.println(T3.getV1()+" "+T3.getV2());
        i = in.nextInt();
        Rational.GetRational(T1, i);
        System.out.println(Rational.GetRational(T1, i));
        System.out.println("201621123023  уекулн");
	}
}


class Rational
{
	private int v1;
	private int v2;
	
	
	public int getV1() 
	{
		return v1;
	}
	public void setV1(int v1) 
	{
		this.v1 = v1;
	}
	public int getV2() 
	{
		return v2;
	}
	public void setV2(int v2) 
	{
		this.v2 = v2;
	}
	public  Rational(int v1, int v2)
    {
        this.v1=v1;
        this.v2=v2;
    }
	public  Rational(){}
	public static int GetRational(Rational T, int i) 
	{
		if(i==1)
            return T.getV1();
        else
            return T.getV2();
	}
	public static void Multiply(Rational T1, Rational T2, Rational T3) 
	{
		int t;
        T3.setV2(T1.getV2()*T2.getV2());
        T3.setV1(T1.getV1()*T2.getV1());
        t=Gcd(T3.getV2(),T3.getV1());
        T3.setV2(T3.getV2()/t);
        T3.setV1(T3.getV1()/t);
	}
	public static void Add(Rational T1, Rational T2, Rational T3) 
	{
		int t;
		T3.setV2(T1.getV2()*T2.getV2());
		T3.setV1(T1.getV1()*T2.getV2()+T2.getV1()*T1.getV2());
	    t=Gcd(T3.getV2(), T3.getV1());
	    T3.setV2(T3.getV2()/t);
	    T3.setV1(T3.getV1()/t);
	}
	public static int Gcd(int m,int n)
    {
        int t;
        while(m%n!=0)
        {
            t=n;
            n=m%n;
            m=t;
        }
        return n;
    }
}
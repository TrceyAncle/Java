package week5;

import java.util.Arrays;
import java.util.Scanner;

import org.omg.PortableInterceptor.ForwardRequestHelper;

public class Main4 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.nextLine());
		double[] doubles = new double[n];
		for (int i = 0; i < n; i++) 
		{
			doubles[i]=new Double(in.nextDouble());
		}
		System.out.println(ArrayUtils.findMinMax(doubles));
		System.out.println(ArrayUtils.PairResult.class);
	}
}

class ArrayUtils
{
	static PairResult findMinMax(double[] doubles)
	{
		Arrays.sort(doubles);
		PairResult pair = new PairResult();
		pair.max=doubles[doubles.length-1];
		pair.min=doubles[0];
		return pair;
	}
	
	
	static class PairResult
	{
		private double min;
		private double max;
		@Override
		public String toString() 
		{
			return "PairResult [min=" + min + ", max=" + max + "]";
		}
	}
}
package Assignments;

import java.util.Scanner;

public class Scanner_Assignment 
{
	static void add(int a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	static void substract(int a, double b)
	{
		double c=a-b;
		System.out.println(c);
	}
	
	static void division(int a, double b)
	{
		double c=a/b;
		System.out.println(c);
	}
	
	static void multiplication(int a, double b)
	{
		double c=a*b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		double b=s1.nextDouble();
		s1.close();
		add(a,b);
		substract(a,b);
		division(a,b);
		multiplication(a,b);
			
	}

}

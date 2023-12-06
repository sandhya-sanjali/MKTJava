package Assignments;

import java.util.Scanner;

public class scanner_Assignment1
{
	void add(int a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}
	void multiply(int a, double b)
	{
		double c= a*b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		double b=s1.nextDouble();
		scanner_Assignment1 s=new scanner_Assignment1();
		s.add(a, b);
		s.multiply(a, b);
				
		

	}

}

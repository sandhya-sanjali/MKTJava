package Practise;

import java.util.InputMismatchException;

public class Exception1
{

	public static void main(String[] args) 
	{
		try {
		int a=1/0;
		System.out.println("try block");
			}
		catch(java.lang.ArithmeticException a1)
		{
			System.out.println("Handled Arithmatic Expression A1");
		}
		catch(NullPointerException a2)
		{
			System.out.println("Handled NPE");
		}
		catch(InputMismatchException a3)
		{
			System.out.println("Handled INME");
		}
		finally
		{
			System.out.println("No matter what, I am always there");
		}
	}

}

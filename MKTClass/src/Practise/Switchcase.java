package Practise;

import java.util.Scanner;

public class Switchcase
{


	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	
	int a=s1.nextInt();
	s1.close();
	
		switch(a)
		{
		case 1: System.out.println("Addition");
		break;
		case 2: System.out.println("Substarction");
		break;
		case 3: System.out.println("Multiplication");
		break;
		default: System.out.println("I");
		
			
		}
	}
}

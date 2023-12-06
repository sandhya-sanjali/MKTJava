package Assignments;

import java.util.Scanner;

public class Array6 
{

	public static void main(String[] args)
	{
		String city[]=new String[4];
		city[0]="Bangalore";
		city[1]="Chennai";
		city[2]="Hyderabad";
		city[3]="Mumbai";
		
		boolean message[]=new boolean[4];
		message[0]=true;
		message[1]=false;
		message[2]=true;
		message[3]=false;
		
		String express[]=new String[4];
		express[0]="been there";
		express[1]="been there many times";
		express[2]="will visit soon";
		express[3]="no plans to visit";
		
//		Scanner s1=new Scanner(System.in);
//		int a=s1.nextInt();
//		s1.close();
		for(int i=0;i<4;i++)
		{
		System.out.println(city[i]+" "+message[i]+" "+express[i]);
		}
		

	}

}

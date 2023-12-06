package Assignments;

public class Array3 
{

	public static void main(String[] args) 
	{
		String[]name=new String[3];
		name[0]="Ram";
		name[1]="Laxman";
		name[2]="Sita";
		
		int age[]=new int[3];
		age[0]=25;
		age[1]=24;
		age[2]=28;
		
		char gender[]=new char[3];
		gender[0]='m';
		gender[1]='m';
		gender[2]='f';
		
		for(int i=0;i<3;i++)
		{
			System.out.print(name[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<3;i++)
		{
			System.out.print(age[i]+"    ");
		}
		System.out.println("");
		for(int i=0;i<3;i++)
		{
			System.out.print(gender[i]+"      ");
		}
		

	}

}

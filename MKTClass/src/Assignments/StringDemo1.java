package Assignments;

public class StringDemo1
{
	public static void main(String[] args) 
	{
		String a="India";
		String b="is my country";
		String c= "Manish Kumar Tiwari";
		String d="MANISH";
		String e="Abhishek";

		System.out.println(a.concat(" ").concat(b));
		System.out.println(c.substring(0,6));
		System.out.println(c.substring(7, 12));
		System.out.println(c.substring(13, 19));
		System.out.print(c.charAt(0));
		System.out.print(c.charAt(7));
		System.out.println(c.charAt(13));
		System.out.println(c.charAt(0));
		System.out.println(c.charAt(7));
		System.out.println(c.charAt(13));
		
		for(int i=0;i<d.length();i++)
		{
			System.out.print(d.charAt(i));
			
			if(i == d.length() - 1) 
			{
				for(int j = d.length()-1; j < e.length(); j++) 
				{
					System.out.print(e.charAt(j));
				}
			}
			else 
			{
				for(int j=i;j<i+1;j++) 
				{
					System.out.print(e.charAt(j));
				}
			}
		}
		
	}

}

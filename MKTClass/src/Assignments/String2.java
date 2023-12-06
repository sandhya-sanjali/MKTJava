//input :Manish
//Output:MaNiSh
package Assignments;

public class String2 
{
	public static void main(String[] args)
	{
		String a="Manish";
		for(int i=0; i<a.length();i++)
		{
			if(i%2==0)
			{
				System.out.print(a.toUpperCase().charAt(i));
			}
			else
			{
				System.out.print(a.charAt(i));	
			}
		
		}

	}

}

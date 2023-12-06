package Collection;

import java.util.HashSet;

public class Hashse1 
{

	public static void main(String[] args) 
	{
		HashSet h1= new HashSet();
		h1.add("sandhya");
		h1.add(58);
		h1.add(5.2);
		h1.add('F');
		h1.add("Sandhya Surendra");
		h1.add("sandhya");
		h1.add(null);
		System.out.println(h1);
		
		HashSet h2= new HashSet();
		h2.add(4567);
		h2.add(47888);
		h2.add(67);
		h2.add(3);
		System.out.println(h2);
		
	}

}

package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class AList1 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Sandhya");
		a1.add(60);
		a1.add('F');
		a1.add(5.2);
		a1.add("Surendra");
		a1.add("null");
		a1.add("Sandhya");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(72);
		a2.add(678);
		a2.add(567);
		a2.add(234);
		a2.add(4567);
		Collections.sort(a2);
		System.out.println(a2);
		
		
	}

}

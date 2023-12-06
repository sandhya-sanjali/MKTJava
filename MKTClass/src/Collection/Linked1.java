package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class Linked1 
{

	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add("sandhya");
		l1.add(58);
		l1.add(5.2);
		l1.add('F');
		l1.add("sandhya");
		l1.add(null);
		l1.add("sandhya surendra");
		System.out.println(l1);
		
		LinkedList l2=new LinkedList();
		l2.add(300);
		l2.add(45);
		l2.add(678);
		l2.add(5678);
		Collections.sort(l2);
		System.out.println(l2);
		
		
		
	}

}

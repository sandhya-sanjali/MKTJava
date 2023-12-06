package Collection;

import java.util.Collections;
import java.util.Vector;

public class Vec1 
{
	public static void main(String[] args)
	{
		Vector v1=new Vector();
		v1.add("sandhya");
		v1.add(58);
		v1.add('F');
		v1.add(null);
		v1.add("sandhya");
		v1.add("sandhya surendra");
		System.out.println(v1);
		
		Vector v2=new Vector();
		v2.add(67);
		v2.add(567);
		v2.add(789);
		v2.add(34);
		v2.add(7890);
		Collections.sort(v2);
		System.out.println(v2);
	}

}

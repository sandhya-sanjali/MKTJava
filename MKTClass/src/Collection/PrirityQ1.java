package Collection;

import java.util.PriorityQueue;

public class PrirityQ1 
{

	public static void main(String[] args) 
	{
		PriorityQueue q1=new PriorityQueue();
		q1.add("sandhya");
//		q1.add(58);
//		q1.add(5.3);
//		q1.add('F');
		q1.add("sandhya surendra");
		q1.add("sandhya");
	//	q1.add(null);
		System.out.println(q1);
		
		PriorityQueue q2=new PriorityQueue();
		q2.add(67);
		q2.add(5);
		q2.add(5678);
	//	q2.add("sandhya");//considering only homogeneous data
		System.out.println(q2);
		
	}

}

//converting int into double

package TypeCasting;

public class Widen2 
{
	public static void main(String[] args)
	{
		int weight = 58;
		double weight1= (double) weight;
		System.out.println(weight1);//explicit
		
		double weight2=weight;
		System.out.println(weight2);//implicit
		
	}

}

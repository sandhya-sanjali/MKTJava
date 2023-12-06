package TypeCasting;

public class Widen 
{
	//convert int weight into double
	public static void main(String[] args)
	{
		int wt =85;
		double wt1= wt;//implicit
		System.out.println(wt1);
		
		double wt2=(double) wt;
		System.out.println(wt2);//explicit
		
	}

}

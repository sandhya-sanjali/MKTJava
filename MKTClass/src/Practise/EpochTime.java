package Practise;

import java.util.Date;

public class EpochTime 
{

	public static void main(String[] args)
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		
		Date d2=new Date(d1.getTime()+(1000*60*60*24*1));
		Date d3=new Date(d1.getTime()-(1000*60*60*24*1));
		System.out.println(d3);
		System.out.println(d2);
		
		String formatofdate =d2.toString();
		int length = formatofdate.length();
		System.out.println(length);
		
		String year=formatofdate.substring(24);
		System.out.println(year);
		
		String month = formatofdate.substring(4, 7);
		System.out.println(month);
		
		String date =formatofdate.substring(8, 10);
		System.out.println(date);
		
		String SS=date.concat(month).concat(year);
		System.out.println(SS);
		
		String SA=date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(SA);
		
		String format1=date.concat("_").concat(month).concat("_").concat(year);
		System.out.println(format1);
		
		String format2=date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format2);

	
	
	}

}

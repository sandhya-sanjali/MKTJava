package MethodOverloading;

public class Methodoverloading1 
{
static void add()
	{
		System.out.println("1");
	}
static void add(int a, int b)
	{
		System.out.println("2");
	}
static void add(int a, int b, char c)
	{
		System.out.println("3");
	}
public static void main(String[] args) 
	{
	add();
	add(86, 987);
	add();
	add(34,4565,'A');
	}

}

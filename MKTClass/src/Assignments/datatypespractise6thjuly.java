package Assignments;

public class datatypespractise6thjuly {
	static void add(int a, int b) {
		System.out.println("addition");
		System.out.println(a+b);
	}
	
	static void substract(int a, int b) {
		System.out.println("substraction");
		System.out.println(a-b);
	}
	
	static void multiply(int a, int b) {
		System.out.println("multiplication");
		System.out.println(a*b);
	}
	
	static void divide(int a, int b) {
		System.out.println("division");
		System.out.println(b/a);
	}
	
	public static void main(String[] args) {
		int a=5; int b=15; 
		add(a,b);
		substract(a,b);
		multiply(a, b);
		divide(a, b);
	}

}

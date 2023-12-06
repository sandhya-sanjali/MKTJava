package Practise;

public class Nonstaticpractise {

		void add(int a, int b) {
			System.out.println("addition");
			System.out.println(a+b);
		}
		
		void substract(int a, int b) {
			System.out.println("substraction");
			System.out.println(a-b);
		}
		
		 void multiply(int a, int b) {
			System.out.println("multiplication");
			System.out.println(a*b);
		}
		
		 void divide(int a, int b) {
			System.out.println("division");
			System.out.println(b/a);
		}
		
		public static void main(String[] args) {
			int a=5; int b=15; 
			
			Nonstaticpractise s = new Nonstaticpractise();
			s.add(a, b);
			s.substract(a,b);
			s.multiply(a, b);
			s.divide(a, b);
		}


	}
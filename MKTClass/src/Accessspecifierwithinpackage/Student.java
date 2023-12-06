package Accessspecifierwithinpackage;

import Accessspecifieroutsidepackage.Arithmaticoperations;

public class Student extends Arithmaticoperations//consider this as the child class of outside package

{

	public static void main(String[] args)
	{
		Student s1= new Student();
		s1.add();
		s1.multiplicatio();
	}
	/*{
		Teacher t=new Teacher();
		t.add();
		t.multiplicatio();
		t.divide();

	}*/
	

}

package a_polymorphism;

/*5.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with two instance methods
b. Create a child class (ex:Child1) by inheriting above Parent class and define the same two instance methods of above parent class and call only the child class methods using parent class reference in main method.*/

public class polymorhism5 extends polymorhism5parent{

	void m1(short a){
		System.out.println("Child short arg m1 method");
	}
	void m2(double d){
		System.out.println("Child double args m1 method");
	}
	public static void main(String[] args) {
		polymorhism5parent p=new polymorhism5();
		
		p.m1((short)10);
		p.m2(12.5);
		
	} 
}
class polymorhism5parent{
	void m1(short a){
		System.out.println("Parent short arg m1 method");
	}
	void m2(double d){
		System.out.println("Parent double args m1 method");
	}
}

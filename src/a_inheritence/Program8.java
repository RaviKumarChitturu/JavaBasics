package a_inheritence;
/*8.Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with two instance methods
b. Create a child class (ex:Child1) by inheriting above Parent class and define the same two instance methods of above parent class and call the parent & child class methods in main method.
*/

public class Program8 extends Program8Parent{
	void m1(){
		System.out.println("child m1 method");
		

	}
	void m2(){
		System.out.println("child m1 method");
		
	}
	public static void main(String[] args) {
		Program8 p=new Program8();
		p.m1();
		p.m2();
		Program8Parent pp=new Program8Parent();
		pp.m1();
		pp.m2();
	}
}

class Program8Parent {

	void m1(){
		System.out.println("Parent m3 method");
		

	}
	void m2(){
		System.out.println("Parent m5 method");
		
	}
	}

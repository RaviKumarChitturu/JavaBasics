package a_inheritence;
/*1.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with two instance methods
b. Create a child class (ex:Child1) by inheriting above Parent class and define other two instance methods and then call all the parent and child class methods in main method
*/

public class Program1 extends Program1Parent{
	void m1(){
		System.out.println("child m1 method");
	}
	void m2(){
		System.out.println("child m1 method");
	}
	public static void main(String[] args) {
		Program1 p=new Program1();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
	}
}

class Program1Parent{
	void m3(){
		System.out.println("Parent m3 method");
	}
	void m4(){
		System.out.println("Parent m4 method");
	}
}
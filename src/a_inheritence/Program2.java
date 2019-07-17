package a_inheritence;
/*2.Write programs for the following scenarios:
a. Create a parent class (ex:Parent2) with two instance variables and two instance methods
b. Create a child class (ex:Child2) by inheriting above Parent class and define other two instance methods and then call all the parent and child class members in main method
*/

public class Program2 extends Program2Parent{
	void m1(){
		System.out.println("child m1 method");
	}
	void m2(){
		System.out.println("child m1 method");
	}
	public static void main(String[] args) {
		Program2 p=new Program2();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		System.out.println("Program2Parent class Instance Variable int value:"+p.a);
		System.out.println("Program2Parent class Instance Variable String value:"+p.UserName);
		
	}
}

class Program2Parent{
	int a=10;
	String UserName="Ravi";
	void m3(){
		System.out.println("Parent m3 method");
	}
	void m4(){
		System.out.println("Parent m4 method");
	}
}
package a_inheritence;
/*3.Write programs for the following scenarios:
a. Create a parent class (ex:Parent3) with two static variables and one instance & static methods
b. Create a child class (ex:Child3) by inheriting above Parent class and define other two instance methods with return type String and then call all the parent and child class members in main method
*/

public class Program3 extends Program3Parent{
	String m1(){
		
		return "child m1 method return value";	
	}
	String m2(){
		
		return "child m2 method return value";	
	}
	public static void main(String[] args) {
		Program3 p=new Program3();
		System.out.println(p.m1());
		System.out.println(p.m2());
		p.m3();
		Program3.m4();
		System.out.println("Program2Parent class Instance Variable int value:"+Program3.a);
		System.out.println("Program2Parent class Instance Variable String value:"+Program3.UserName);
		
	}
}

class Program3Parent{
	static int a=10;
	static String UserName="Ravi";
	void m3(){
		System.out.println("Parent m3 method");
	}
	static void m4(){
		System.out.println("Parent m4 method");
	}
}
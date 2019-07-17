package a_inheritence;
/*4.Write programs for the following scenarios:
a. Create a parent class (ex:Parent4) with two instance variables and one instance & static methods
b. Create a child class (ex:Child4) by inheriting above Parent class and define other one instance method with return type boolean and then call all the possible members using parent class object in main method
*/

public class Program4 extends Program4Parent{
	boolean m1(){
		
		return true ;	
	}
	String m2(){
		
		return "child m2 method return value";	
	}
	public static void main(String[] args) {
		Program4 p=new Program4();
		System.out.println(p.m1());
		System.out.println(p.m2());
		p.m3();
		Program4.m4();
		System.out.println("Program2Parent class Instance Variable int value:"+p.a);
		System.out.println("Program2Parent class Instance Variable String value:"+p.UserName);
		
	}
}

class Program4Parent{
	 int a=10;
	 String UserName="Ravi";
	void m3(){
		System.out.println("Parent m3 method");
	}
	static void m4(){
		System.out.println("Parent m4 method");
	}
}
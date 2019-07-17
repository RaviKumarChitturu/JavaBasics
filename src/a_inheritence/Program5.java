package a_inheritence;
/*5.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with one instance & one static variable and one instance & one static method
b. Create another class (ex:Parent2) by inheriting above Parent class (Parent1) and define other one instance method with return type boolean & one static method
c. Create a child class (ex:Child1) by inheriting above Parent class(Parent2) and define other two instance methods and then call all the parent & child class members in main method.
*/

public class Program5 extends Program5Parent{
	void  m1(){
		
		System.out.println("child m1 method ");
	}
	void m2(){
		System.out.println("child m2 method ");
		
	}
	public static void main(String[] args) {
		Program5 p=new Program5();
		p.m1();
		p.m2();
		p.m3();
		Program5.m4();
		p.m5();
		Program5.m6();
		System.out.println("Program2Parent class Instance Variable int value:"+p.a);
		System.out.println("Program2Parent class Instance Variable String value:"+p.UserName);
		System.out.println("Program2Parent class Instance Variable int value:"+p.b);
		System.out.println("Program2Parent class Instance Variable String value:"+Program5.UserName1);
	}
}

class Program5Parent extends Program5GrandParent{
	 int a=10;
	 String UserName="Ravi";
	boolean m3(){
		System.out.println("Parent m3 method");
		return true;
		 
	}
	static void m4(){
		System.out.println("Parent m4 method");
	}
}

class Program5GrandParent{
	 int b=20;
	 static String UserName1="Raja";
	void m5(){
		System.out.println("GrandParent m5 method");
	}
	static void m6(){
		System.out.println("GrandParent m6 method");
	}
}
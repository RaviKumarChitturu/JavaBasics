package a_inheritence;
/*7.Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with two instance methods with return type String
b. Create another class (ex:Parent2) by inheriting above Parent class (Parent1) and define other two instance method with return type int & one static method with return type String
c. Create a child class (ex:Child1) by inheriting above Parent class(Parent2) and define other two instance variables & two instance methods and then call only the above two parent class members using parent2 class object in main method.
*/

public class Program7 extends Program7Parent{
	int c=50;
	double d=15.00;
	 void  m1(){

		System.out.println("child m1 method ");
	}
	 void m2(){
		System.out.println("child m2 method ");

	}
	public static void main(String[] args) {
		Program7Parent p=new Program7Parent();
		p.m3();
		Program7.m4();
		p.m5();
		p.m6();
		p.m7();
		
	}
}

class Program7Parent extends Program7GrandParent{

	int m3(){
		System.out.println("Parent m3 method");
		return 10;

	}
	int m5(){
		System.out.println("Parent m5 method");
		return 20;

	}
	static String m4(){
		System.out.println("Parent m4 method");
		return "Veda";
	}
}

class Program7GrandParent{
	String m6(){
		System.out.println("GrandParent m6 method");
		return "Kumar";
	}
	 String m7(){
		System.out.println("GrandParent m7 method");
		return "Amruth";
	}
}
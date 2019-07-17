package a_inheritence;
/*6.Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with one instance & one static variable of type String and one instance & one static method with return type String
b. Create another class (ex:Parent2) by inheriting above Parent class (Parent1) and define other one instance method with return type int & one static method with return type String
c. Create a child class (ex:Child1) by inheriting above Parent class(Parent2) and define other two instance variables & two static methods and then call all the parent & child class members in main method.
*/

public class Program6 extends Program6Parent{
	int c=50;
	double d=15.00;
	static void  m1(){
		
		System.out.println("child m1 method ");
	}
	static void m2(){
		System.out.println("child m2 method ");
		
	}
	public static void main(String[] args) {
		Program6 p=new Program6();
		Program6.m1();
		Program6.m2();
			p.m3();
		Program6.m4();
			p.m5();
			p.m6();
		Program6.m7();
		System.out.println(p.c);
		System.out.println(p.d);
		System.out.println(p.Username2);
		System.out.println(Program6.UserName1);
					
	}
}

class Program6Parent extends Program6GrandParent{
	 
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

class Program6GrandParent{
	 String Username2="Yashi";
	 static String UserName1="Raja";
	String m6(){
		System.out.println("GrandParent m6 method");
		return "Kumar";
	}
	static String m7(){
		System.out.println("GrandParent m7 method");
		return "Amruth";
	}
}
package a_polymorphism;

/*6.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with one instance method having default modifier, return type String
b. Create a child class (ex:Child1) by inheriting above Parent class and override the same instance method of above parent class with all possible access modifiers.
(note: comment previous method if there are more possibilities)
*/
public class polymorhism6 extends polymorhism6parent{

	/*public String m1(){
		System.out.println("public Child short arg m1 method");
		return null;
	}*/
	
	
		protected String m1(){
		System.out.println("protected Child short arg m1 method");
		return null;
	}
	

	/*	String m1(){
		System.out.println("Default Child short arg m1 method");
		return null;
	}*/
	
	
	/*//Cannot reduce the visibility of the inherited method from polymorhism6parent
	private String m1(){
		System.out.println("protected Child short arg m1 method");
		return null;
	}*/
	public static void main(String[] args) {
		polymorhism6 p=new polymorhism6();

		p.m1();
	} 
}
class polymorhism6parent{
	String m1(){
		System.out.println("Parent short arg m1 method");
		return null;
	}

}

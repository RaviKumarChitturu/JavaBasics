package a_polymorphism;

/*7.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) with one instance method having int var-args.
b. Create a child class (ex:Child1) by inheriting above Parent class and overload
 the same instance method of above parent class with single int parameter 
 and then call the method with all possible reference types.
c. Create a child class (ex:Child2) by inheriting above Parent class and override
 the same instance method of above parent class and then call the method 
 with all possible reference types.
*/
class polymorhism7parent{
	void m1(int... a){
		System.out.println("Parent var arg m1 method");
	}
void m2(){
		
	}
	
	
}

public class polymorhism7 extends polymorhism7parent{
	void m1(int a){
		System.out.println("child int arg m1 method");
	}
	
	public static void main(String[] args) {
		polymorhism7 p=new polymorhism7();
		polymorhism7parent p1=new polymorhism7parent();
		polymorhism7parent p2=new polymorhism7();
	//Overloading   ---------- Overriding
		p.m1(10);
		p.m1(10,20,30);
		p1.m1(10,30,60,90);
		p2.m1(1,5,8,9);
		
		
	
		
		} 
}
/*public class polymorhism7 extends polymorhism7parent{
	void m1(int... a){
		System.out.println("child int arg m1 method");
	}
	
	public static void main(String[] args) {
		polymorhism7 p=new polymorhism7();
	
		p.m1(10,20);
		
	
	
	} 
}
*/


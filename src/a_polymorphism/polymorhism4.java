package a_polymorphism;

//4.Write a program to define 2 instance methods with same name and one argument of type double & short respectively and call the method with all possible types of values as parameter.
public class polymorhism4 {

	void m1(short a){
		System.out.println("short arg m1 method");
	}
	void m1(double d){
		System.out.println("double args m1 method");
	}
	public static void main(String[] args) {
		polymorhism4 p=new polymorhism4();
		p.m1(10);
		p.m1((byte)10);
		p.m1(10.2f);
		p.m1((short)10);
		p.m1((long)12564668);
		
		
	} 
}

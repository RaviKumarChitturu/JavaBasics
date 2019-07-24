package a_polymorphism;

//3.Write a program to define 2 instance methods and 2 static methods with same name and two arguments and then call all the 4 methods in main method.

public class polymorhism3 {

	void m1(int a,String user){
		System.out.println("int and String args m1 method");
	}
	void m1(double d,float f){
		System.out.println("double and float args m1 method");
	}
	static void m1(char c,String user){
		System.out.println("char and String args static m1 method");
	}
	static void m1(long l,float f){
		System.out.println("long and float args static m1 method");
	}
	public static void main(String[] args) {
		polymorhism3 p=new polymorhism3();
		p.m1(20, "User");
		p.m1(15.25, 14.23f);
		polymorhism3.m1('c', "user");
		polymorhism3.m1(15255445, 14.23f);
	} 
}

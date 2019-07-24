package a_polymorphism;

//2.Write a program to define 3 static methods with same name and single argument and then call all the 3 methods in main method.

public class polymorhism2 {
 static void m1(boolean b){
	 System.out.println("boolean arg m1 method");
 }
 static void m1(int a){
	 System.out.println("int arg m1 method");
 }
 static void m1(String user){
	 System.out.println("String arg m1 method");
 }
 
 public static void main(String[] args) {
	 polymorhism2.m1(true);
	 polymorhism2.m1(10);
	 polymorhism2.m1("User");
}
}

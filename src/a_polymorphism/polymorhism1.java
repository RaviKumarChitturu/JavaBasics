package a_polymorphism;

//1.Write a program to define 3 instance methods with same name and different number of arguments and then call all the 3 methods in main method.

public class polymorhism1 {
 void m1(){
	 System.out.println("Zero arg m1 method");
 }
 void m1(int a){
	 System.out.println("single arg m1 method");
 }
 void m1(int a,String user){
	 System.out.println("two arg m1 method");
 }
 
 public static void main(String[] args) {
	 polymorhism1 p=new polymorhism1();
	 p.m1();
	 p.m1(10);
	 p.m1(20, "User");
}
}

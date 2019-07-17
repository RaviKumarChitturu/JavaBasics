package test;

abstract class ClassA
{  
  abstract void run();  
}  
class Abs1 extends ClassA{  
void run()
{
System.out.println("I am from class2 ");
}  
public static void main(String args[])
{  
	ClassA obj = new Abs1();  
 obj.run();  
}  
}  
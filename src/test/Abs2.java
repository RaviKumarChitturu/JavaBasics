package test;

abstract class Shape
{  
abstract void draw();  

  
void method1()
{
	System.out.println("....");
}
}


class Rectangle extends Shape{  
void draw()
{
System.out.println("drawing rectangle");
}  
}  
class Circle1 extends Shape{  
void draw()
{
System.out.println("drawing circle");
}  
}  

class Abs2{  
public static void main(String args[]){  
Shape s=new Circle1();
//Circle1 c2 = new Circle1();
s.method1();
	
	
s.draw(); 
s.method1();
}  
}

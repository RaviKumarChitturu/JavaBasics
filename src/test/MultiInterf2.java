package test;

interface Printable
{  
void print();  
}  
interface Showable
{  
void show();  
}  
  
class MultiInterf2 implements Printable,Showable
{  
public void print()
{
System.out.println("Hello");
}  

public void show()
{
System.out.println("Hello");
} 
public static void main(String args[])
{  
MultiInterf2 obj = new MultiInterf2();  
obj.print();  
 }  
}  
package test;
  
class Mullterf implements Printable,Showable
{  
  
public void print()
{
System.out.println("Hello");
}  
public void show()
{
System.out.println("Welcome");
}  

public void currentClassMethod()
{
System.out.println("Welcome");
} 
  
public static void main(String args[])
{  
Printable aPrintObj = new Mullterf();  
aPrintObj.print(); 



Showable aShowObj = new Mullterf();  
aShowObj.show();  


 
}  
}  
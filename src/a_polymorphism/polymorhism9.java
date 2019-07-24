package a_polymorphism;

/*9.	Write programs for the following scenarios:
a. Create a parent class (ex:Parent1) and declare two instance variables of 
type String with values assigned
b. Create a child class (ex:Child1) by inheriting above Parent class and 
declare same two instance variables of type String with different values assigned
 and define one instance method with two String parameters and print the values
  of all variables such as local, instance & parent class variables inside this 
  instance method, finally call the instance method in main method. 
  (note: all the variable names should be same).
*/
class polymorphism9parent{
	 String Usr1="RaviParent",Usr2="BhaskerParent";
	}

public class polymorhism9 extends polymorphism9parent{
	String Usr1="Bhavani",Usr2="Maheswari";
	void m1(String Usr1,String Usr2){
		
		System.out.println("local Usr1:"+Usr1);
		System.out.println("local Usr2:"+Usr2);
		System.out.println("Instance Usr1:"+this.Usr1);
		System.out.println("Instance Usr1:"+this.Usr2);
		System.out.println("Parent Instance Usr1:"+super.Usr1);
		System.out.println("Parent Instance Usr1:"+super.Usr2);
			}
	public static void main(String[] args) {
		polymorhism9 p=new polymorhism9();
		p.m1("Ravi","Bhasker");
	}
}
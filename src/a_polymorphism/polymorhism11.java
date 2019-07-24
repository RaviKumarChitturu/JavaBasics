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
class polymorphism11parent{
	polymorphism11parent(int a){
			System.out.println("Parent single constructor");
			}
	polymorphism11parent(){
		this(10);
		System.out.println("parent zero constructor");
	}
	void m1(){
		System.out.println("polymorphism11parent");
	}
	}

public class polymorhism11 extends polymorphism11parent{
	polymorhism11(){
		this(10);
		System.out.println("Child zero");
			}
	polymorhism11(int a){
		super();
		System.out.println("Child single");
	}
		void m1(){
			System.out.println("polymorphism11");
			}
		 void m2(){
			this.m1();
			super.m1();
		}
	public static void main(String[] args) {
		polymorhism11 p=new polymorhism11();
		p.m2();
	}
}
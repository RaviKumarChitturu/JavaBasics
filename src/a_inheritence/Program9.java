package a_inheritence;
/*9.Write a program to prevent child or sub class creation for parent class.*/

public class Program9 extends Program9Parent{ 
	//Error: The type Program9 cannot subclass the final class Program9Parent
	void m3(){
		System.out.println("child m1 method");
		

	}
	void m4(){
		System.out.println("child m1 method");
		
	}
	public static void main(String[] args) {
		Program9 p=new Program9();
		p.m3();
		p.m4();
		
	}
}

final class Program9Parent {

	void m1(){
		System.out.println("Parent m3 method");
		

	}
	void m2(){
		System.out.println("Parent m5 method");
		
	}
	}

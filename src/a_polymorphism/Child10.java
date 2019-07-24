package a_polymorphism;

class parent10{
	parent11 m1(){
		System.out.println("parent11 m1 method");
		return new parent11();
		
	}
}

public class Child10 extends parent10{
	
	child11 m1(){
		System.out.println("Child11 m1 method");
		return new child11();
		
	}
	
	public static void main(String[] args) {
		
		Child10 c10=new Child10();
		c10.m1();
		parent10 p10=new parent10();
		p10.m1();
		parent10 p=new Child10();
		p.m1();
		
		
	}
}

class child11 extends parent11
{   void m2(){
	
}
	
}
class parent11{
		
}
package practice;

public class ObjectDemo {
	
	
	//instance Variable declaration
	int a,b,c,d;
	String string;
	//Static variable declaration
	static int static1;
	
	
	void m1(int a, int b)//declaration
	{
	static1=10;	
	
	
	this.a=a;
	this.b=b;
	
	System.out.println(a+"\t"+b);
	System.out.println("Static variable"+static1);
		//implementation part
	}
	
	static void staticm1(){
		
		ObjectDemo obj= new ObjectDemo();
		ObjectDemo obj1= new ObjectDemo();
		obj.a=100;
		obj.b=200;
		System.out.println(obj1.a+"\t"+obj.b);
	}
	
	public static void main(String[] args) {
	
		ObjectDemo.staticm1();
		
		ObjectDemo obj= new ObjectDemo();
		
		//obj.m1(30,40);
		//obj.staticm1();
		//System.out.println(obj.a+" "+obj.b);
		
		
	}

}

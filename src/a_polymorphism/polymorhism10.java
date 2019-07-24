package a_polymorphism;


class polymorphism10parent{
	 String Usr1="RaviParent",Usr2="BhaskerParent";
	 void m1(){
		 System.out.println("Parent m1 method");
	 }
	}

public class polymorhism10 extends polymorphism10parent{
	String Usr1="Bhavani",Usr2="Maheswari";
	void m1(){
		 System.out.println("child m1 method");
		 	}
	void m3(){
		super.m1();
	}
	
	void m2(String Usr1,String Usr2){
		System.out.println("local Usr1:"+Usr1);
		System.out.println("local Usr2:"+Usr2);
		System.out.println("Instance Usr1:"+this.Usr1);
		System.out.println("Instance Usr1:"+this.Usr2);
		System.out.println("Parent Instance Usr1:"+super.Usr1);
		System.out.println("Parent Instance Usr1:"+super.Usr2);
							}
	public static void main(String[] args) {
		polymorhism10 p=new polymorhism10();
		p.m2("Ravi","Bhasker");
		p.m3();
	}
}
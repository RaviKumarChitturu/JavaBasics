package javaMethods;

public class ClassB extends ClassA {

	public void car(){
		System.out.println("car in classB");
	}
	
	public static void main(String[] args) {
		ClassA cbA=new ClassB();
		cbA.car();
		
		
		ClassB cbB = new ClassB();
		cbB.car();
		cbB.test();
		
	}
}

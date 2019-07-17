package Kesi;

public class Main_Overloading1 {
	
	public static void main(int a) {
		System.out.println(a);
	}
	public static void main(String a) {
		System.out.println(a);
	}
	

	public static void main(String[] abcd) {
		//System.out.println("main() method invoked");  
		 main(1);
		 main("Testing");

	}

}

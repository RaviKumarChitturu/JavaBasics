package myPractice;

public class P {
	
	void m1(P2 z){
		System.out.println("Constructor P");
		z.m2();
		int k=z.j;
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		P p=new P();
		p.m1(new P2());
		

	}

}



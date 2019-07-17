package Kesi;

public class ThisKeyWord {
	int a=100;
	int b=200;

	public void add(int c ,int d){
		System.out.println(a+b);
		System.out.println(c+d);
	}
	
	public void add1(int a ,int b){
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}

	public static void main(String[] args) {
		ThisKeyWord tc=new ThisKeyWord();
		tc.add(10,25);
		tc.add1(50, 60);
	}


}

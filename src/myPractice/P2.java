package myPractice;

public class P2 {
	int j=20;
	int[] m2(){
		System.out.println("P2 m2 method");
		
		int[] a= new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		return a;
	}
	public static void main(String[] args) {
		P2 p=new P2();
		int[] b=p.m2();
		for(int i=0;i<3;i++){
			 System.out.println(b[i]);
		}
	
	}

}

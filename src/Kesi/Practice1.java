package Kesi;

public class Practice1 {
	
	String val1="123";
	Object val2="123";
	String val3="Kesi";
	int a=123;
	
	
	public void matchTwoValues(){
		System.out.println();
		System.out.println(val1.equals(val2));
		System.out.println(val1.contentEquals(val3));
	}
	
		
	public void assign(int val){
		System.out.println(val);
		String j="BigStringBigStringBigStringBigStringBigString";
		for(int i=1;i<10000000;i++){
		System.out.println(i);
		i=0;
		String obj1= new String("Kesi");
		String obj2= new String("Kesi");
		}
		
		//assign(10);
	}
	
	public static void main(String[] args) {
		
		 Practice1 p1= new Practice1();
		// p1.assign(10);
		 p1.matchTwoValues();
		// System.out.println(p1.obj1);
		// System.out.println(p1.obj2);
		// System.out.println(p1.obj1.equals(p1.obj2));
		
		//System.out.println(val1==val2);
	}
	

}

package abstract_metods;

public class MyTest1 {
	
	public void test(){
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		MyTest a=new MyTest();
		String str=a.mymethod("Kesi");
		System.out.println(str);
	}

}

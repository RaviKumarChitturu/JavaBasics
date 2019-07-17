package practice;

public class String_Buffer {
	
	public static boolean mytest(){
		StringBuffer str =new StringBuffer();
		boolean test=false;
		String a="Test";
		String b="Test";
		String c="Test";
		String d="Test1";
		if(!a.contentEquals(b)){
			str.append("A and B is not matched");
		}
		if(!c.contentEquals(d)){
			str.append("C and D is not matched");
		}
		if(str.length()==0){
			test=true;
			System.out.println("All matched: "+str);	
		}
		else{
			test=false;
			System.out.println("not matched: "+str);
		}
		return test;
	}
	
	public static void main(String[] args) {
		boolean a=mytest();
		System.out.println(a);
	}
}

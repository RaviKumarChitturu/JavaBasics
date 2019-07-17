package controlflow;

import org.testng.Assert;

public class IFelseProg {
	
	
	public static boolean mytest(){
		
		String a="Hello", b="Test"; 
		String aa="Hello", bb="Test"; 
		StringBuffer buffer = new StringBuffer();
		
		boolean f=false;
		//boolean f1=false;
		boolean f2=false;
		  boolean f1=false;
		
		if(a.contentEquals(aa)){
			System.out.println("if");
			f1=true;
			
		}
		else{
			System.out.println("else");
			f1=false;
		}
		
		if(f1){
			f=true;
		}
		else{
			f=false;
		}
		
		return f;
		
	}
	
	public static void myIfCond(String a,String b){
		
		
		if(a.contentEquals("Circulus - Online Check Request")){
			System.out.println("Circulus - Online Check Request");
		}
		
		if((a.contentEquals("Circulus - Document Status"))&&(b.contentEquals("Ready for Review"))){
			System.out.println("Circulus - Document Status: "+b);
		}
		else if(a.contentEquals("Circulus - Document Status")){
			System.out.println("Circulus - Document Status");
		}
	}
	
	
	
	
	
	public static void main(String[] args)
	{

		/*boolean a=mytest();
		System.out.println(a);*/
		
		myIfCond("Circulus - Online Check Request","Ready for Review");
		myIfCond("Circulus - Document Status","paid");
		myIfCond("Circulus - Document Status","");

		/*if(a.contentEquals("Hello")){


			try {
				Assert.assertEquals(a,aa);
			} catch (Error e) {
				buffer.append(e.toString());
			}
			try {
				Assert.assertEquals(b,bb);
			} catch (Error e) {
				buffer.append(e.toString());
			}
		}
	
		if(buffer.length()==0){
			System.out.println("PASS");
		}else{
			System.out.println("FAILE");
		}
		System.out.println("Kesi");
		System.out.println("Kesi: "+bb);*/

	}

}







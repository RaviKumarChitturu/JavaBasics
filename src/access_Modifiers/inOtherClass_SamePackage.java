package access_Modifiers;

public class inOtherClass_SamePackage {
	
	public static void main(String[] args) {
		ClassLevel_Modifiers cm=new ClassLevel_Modifiers();
		System.out.println("protected modifier variable value:"+cm.b);
		System.out.println("deafault modifier variable value:"+cm.d);
		System.out.println("public modifier variable value:"+cm.s);


	}

}

package access_Modifiers;

public class ClassLevel_Modifiers {
	
	private int a=10;
	public String s="Ravi";
	protected boolean b=false;
	 double d=12.45;//Default modifier is applicable by default

	public static void main(String[] args) {
		ClassLevel_Modifiers cm=new ClassLevel_Modifiers();
		System.out.println("protected modifier variable value:"+cm.b);
		System.out.println("deafault modifier variable value:"+cm.d);
		System.out.println("public modifier variable value:"+cm.s);
		System.out.println("private modifier variable value:"+cm.a);
	}
}

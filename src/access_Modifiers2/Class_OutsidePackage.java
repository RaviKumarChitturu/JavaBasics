package access_Modifiers2;

import access_Modifiers.ClassLevel_Modifiers;

public class Class_OutsidePackage {
	public static void main(String[] args) {
		ClassLevel_Modifiers cm= new ClassLevel_Modifiers();
		System.out.println("public modifier variable value:"+cm.s);
	}
   
}

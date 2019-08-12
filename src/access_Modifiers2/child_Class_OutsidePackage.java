package access_Modifiers2;

import access_Modifiers.ClassLevel_Modifiers;

public class child_Class_OutsidePackage extends ClassLevel_Modifiers{
	
public static void main(String[] args) {
	child_Class_OutsidePackage cc=new child_Class_OutsidePackage();
	 
	System.out.println("public modifier variable value:"+cc.s);
	System.out.println("protected modifier variable value:"+cc.b);
	 
	System.out.println("default and private are not allowed outside package");
	
	
}
}

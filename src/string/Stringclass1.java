package string;

public class Stringclass1 {
	int a=10;
	

	public static void main(String[] args) {
		 String s="Ravi";
	     StringBuffer sb= new StringBuffer("Amruth");
		Stringclass1 sc=new Stringclass1();
		System.out.println(sc.a);
		System.out.println(sc);
		System.out.println(sc.toString());
		System.out.println(s);
		System.out.println(s.toString());
        String    a= s.concat("Kumar");
        System.out.println(a);
        StringBuffer s1=sb.append("Kumar");
        System.out.println(s1);
	}

}

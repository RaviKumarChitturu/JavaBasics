package practice;

public class StringReplace {

	public static void main(String[] args) {
		//final String sentence = "Define, Measure, Analyze, Design and Verify";
		String a="Testing";
		String b = a.replace(a, "Kesi");
		String c = a.concat("kkkkkkk").concat(a).concat(b);
		System.out.println(b);
		System.out.println(c);

	}

}

package controlflow;

public class StringAppendLoop {
	
	public static void main(String[] args) {
		String s = "";
	    for (int i = 0; i <= 10000; i++) {
	        if (s.length() > 0)
	            s += ", ";
	        s += "bar";
	        System.out.println(s += "bar");
	    }
	
	}
	 
}

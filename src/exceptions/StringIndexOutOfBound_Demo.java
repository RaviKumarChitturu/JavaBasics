package exceptions;

public class StringIndexOutOfBound_Demo {
	public static void main(String args[])
    {
        try {
            String a = "This is like chipping"; // length is 22
            int i=a.length();
            char c = a.charAt(23); // accessing 25th element
            System.out.println();
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("String IndexOut Of Bounds Exception "+e);
        }
    }
}

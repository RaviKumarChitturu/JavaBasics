package practice;

import java.util.Random;

import org.testng.annotations.Test;

public class AllPractice {

  @Test
  public static String getRandomString(int strlength)//(Random rng, String characters, int length)
	{

		Random ran = new Random();
		int top = strlength;
		char data = ' ';
		String dat = "";

		for (int i=0; i<=top; i++) {
			data = (char)(ran.nextInt(25)+97);
			dat = data + dat;
		}

		/* char[] text = new char[length];
	    for (int i = 0; i < length; i++)
	    {
	        text[i] = characters.charAt(rng.nextInt(characters.length()));
	    }*/
		System.out.println(dat);
		return new String(dat);
	}
    
  @Test
  public void f() {
	getRandomString(2);
  }
 /* public static void main(String[] args) {
	//String a=getRandomString(5);
	getRandomString(2);
}*/
  
}

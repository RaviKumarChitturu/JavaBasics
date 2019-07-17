package abstract_metods;

public class AbstractConstructorTest {
	public static void main(String args[]) 
	{ 
		Server s = new Tomcat("Tomcat");
		s.start(); 
	}


}

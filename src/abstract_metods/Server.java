package abstract_metods;

public abstract class Server {
	final  String name; 
	
	public Server(String name){ 
		this.name = name; 
	} 
	public abstract boolean start();
	

	public static void main(String[] args) {
		int a=1;
		String b="Test";
		
		System.out.println(a+b);
		
	}
	
}

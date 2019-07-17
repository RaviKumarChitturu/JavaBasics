package practice;

public class recursive {
	
	
	
	public void recursive1(){
		
		
		recursive1();
	}
	

	public static void main(String[] args) {
		
		recursive obj= new recursive();
		
		obj.recursive1();
	}
	
	
	

}

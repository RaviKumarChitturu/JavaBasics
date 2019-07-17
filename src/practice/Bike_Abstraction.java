package practice;

public abstract class Bike_Abstraction {
	
	int a;
	int b;

	void baseEngine(){
	
		System.out.println("write code here to create the Base Engine");
	}
	
	abstract void setColor();
	abstract void setModel();
	abstract void assembledParts();

}
/*class Fazer extends Bike_Abstraction{

	@Override
	void setColor() {
		// TODO Auto-generated method stub
		System.out.println("Set color to Bike");
	}

	@Override
	void setModel() {
		// TODO Auto-generated method stub
		System.out.println("here write code to generate the modle Number");
	}

	@Override
	void assembledParts() {
		// TODO Auto-generated method stub
		
		System.out.println("Wirte code here to assemble all the parts as per design");
	}
}*/
	
 class ExecutionClass{
	
	public static void main(String[] args) {
	
		Fazer obj= new Fazer();
		obj.setColor();

		
	}
	
	
}

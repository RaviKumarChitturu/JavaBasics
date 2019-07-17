package practice;

public interface Vehicle_ExampleForInterface {
	
	public int a=10;
	public int b=20;
	
	void accelaration();
	void applyBreak();
	void drive();
	void start();
	void stop();
	void createShape();
	void fuelPumping();
	void ShowIndicator();
	void StopIndicator();
	
	

}

class car implements Vehicle_ExampleForInterface{

	@Override
	public void accelaration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applyBreak() {
		// TODO Auto-generated method stub
		System.out.println("Develop logic for break functionality");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createShape() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fuelPumping() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShowIndicator() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StopIndicator() {
		// TODO Auto-generated method stub
		
	}
}


	class run{
		
		public static void main(String[] args) {
			
			
			car maruthiCar = new car();
			
			maruthiCar.accelaration();
			maruthiCar.applyBreak();
			maruthiCar.createShape();
		}
		
	}
	


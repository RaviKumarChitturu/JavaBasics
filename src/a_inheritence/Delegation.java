package a_inheritence;
/*9.Write a program to prevent child or sub class creation for parent class.*/

public class Delegation { 

	public static void main(String[] args) {
		display d=new display();
		d.details();
		d.seperate();
		
	}
}

class show {

		void details(){
		System.out.println("Delegation details method");
		}
		void anotherdetails(){
			System.out.println("Delegation anotherdetails method");
		}
	}
class display{
	show s=new show();
	void details(){
		s.details();
		//s.anotherdetails();
	}
	void seperate(){
		s.anotherdetails();
	}
}

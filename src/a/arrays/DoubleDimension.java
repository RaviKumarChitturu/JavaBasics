package a.arrays;
//initializing values to array
public class DoubleDimension {
	
   int a[][]={{10,11,12},{20,21,22},{30,32,33}};
   
   void AssignValues(){
   System.out.println("initializing values to array");
	   for (int i = 0; i < a.length; i++) {
		   for (int j = 0; j < a[i].length; j++) {
			   System.out.print(a[i][j]+" ");
			
		}
		   System.out.println("\n");
		
	}
   }
   
   //dynamically passing values to array
   int b[][]=new int[2][2];
   void Dynamically(){
	   System.out.println("dynamically passing values to array");
	   int Number=1;
	   for (int i = 0; i < b.length; i++) {
		   for (int j = 0; j < b[i].length; j++) {
			   b[i][j]=Number;
			   Number++;
			   System.out.print(b[i][j]+" ");
		}
		   System.out.println("\n");
		}
   }
   //Middle Row data
   void middlerowdata(){
	   
   }
	public static void main(String[] args) {
		DoubleDimension dd=new DoubleDimension();
		dd.AssignValues();
		dd.Dynamically();

	}

}

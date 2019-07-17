package practice;

public class MultiDimensionArray {

	//declaration
	int darr[][];
	int[] darr1[];
	int[][] darr2[];
	//declaration, instantiation and initialization
	static String[][] languages={{"Java","C","C#"},{"Ruby","phython","As400"},
		{"PHP","c++","JavaScript"},{"","",""}};

	//Array declaration, instantiation//  array created with maximum size of 
	//3 rows and columns

	static int[][] numbers= new int[3][3];


	public void PassingDataToArray(){

		//
		int i;
		int number=0;


		//Outer array is pass the control to each row one by one until last row
		for(i=0; i<numbers.length;i++){
			//inner array is for inserting the data to each column of current row			
			for(int j=0;j<numbers[i].length;j++){
				numbers[i][j]=number;

				number++;
			}
		}
	}
	public void iterateTheArrayData(int[][] arr){
		//Outer array is pass the control to each row one by one until last row
		for(int i=0; i<arr.length;i++){
			//inner array is for reading the data from each column of current row
			String holder="";
			for(int j=0;j<arr[i].length;j++){
				//System.out.println(arr[i][j]);
				holder=holder+"\t "+arr[i][j];
			}
			System.out.println(holder);
		}

	}
	public static void main(String[] args){

		MultiDimensionArray obj = new MultiDimensionArray();

		System.out.println(numbers.length+" is the Row size of this array");
		System.out.println(+numbers[0].length +" is the column size of first row");

		obj.PassingDataToArray();
		obj.iterateTheArrayData(numbers);





	}





}

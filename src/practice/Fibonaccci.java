package practice;

public class Fibonaccci {
	public static void main(String[] args) {
		int f1 = 0;
		int f2 = 1;
		int sum = 0;
		for(int i=0; i<=31;){
			System.out.print(f1);
			System.out.print("  ");
			sum = i+f2;
			f2=i;
			f1=sum;
			i=f1;
		}

	}

}

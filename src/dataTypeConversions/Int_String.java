package dataTypeConversions;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Int_String {
	static String sTestCaseID="a";
	static String sTestStepID="b";
	static String sTestDescription="c";
	
	public static  String gettwodecimaldouble(String value)
	{
		
		double outvalue = Double.valueOf(value);
		DecimalFormat df1 = new DecimalFormat("#0.00");
		return df1.format(outvalue);
	}
	
	
	public static double getDoubleValue(String inputValue)
	{
		double output=0;
		if(inputValue.contains(","))
		{
			String splitinput[] = inputValue.split(",");
			String refer="";
			for(int s=0;s<splitinput.length;s++)
			{
				refer = refer+splitinput[s];
			}
			output = Double.parseDouble(refer.trim());
		}
		else{
			output = Double.parseDouble(inputValue.trim());
		}
		return output;
	}
	
	public static void getintValue(){
		int a;
		
		a=1+2;
		System.out.println("first: "+a);
		a=1+3;
		System.out.println("secend: "+a);
		a=1+4;
		System.out.println("Thrid: "+a);
	}
	
	public static void getStringValue(){
		String a;
		a="Test1";
		System.out.println("first: "+a);
		a="Test2";
		System.out.println("secend: "+a);
		a="Test3";
		System.out.println("third: "+a);
	}
	
	public static void main(String[] args) {
		
	/*	
		double app=getDoubleValue("100.0");
		double db=getDoubleValue("100");
		if(app<db){
			System.out.println("AAAAAAAA");
		}
		else{
			System.out.println("BBBBB");
		}
		*/
		/*double app=getDoubleValue("25.51");
		//System.out.println(app);
		double output = Double.parseDouble("500.05");
		//System.out.println(output);
		double invoiceAmount = Double.parseDouble("50");
		double dicountAmount = Double.parseDouble("5");
		double d=invoiceAmount-dicountAmount;
		System.out.println(d);*/
		
		/*String TestCaseID="60.20";
		int a = Integer.parseInt(TestCaseID);
		System.out.println(a);*/
	
		getStringValue();
		
		
	}

}

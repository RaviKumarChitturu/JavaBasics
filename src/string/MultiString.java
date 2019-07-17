package string;

public class MultiString {

	static String a="Page 1 of 2 is missing. As per Financial Policy Manual, we require all the pages to process the invoice. "
			+ "Kindly provide complete back up in order to process this invoice";
	/*static String a="Page 1 of 2 is missing. As per Financial ";*/
	
	static String b="Create Invoice: wsds1212";
	
	static String act="Process 3342666 was submitted.";
	static String exp="was submitted";
	
	public static void main(String[] args) {
		/*String str1=a.replaceAll("\n", "");
		//System.out.println(str1);
		String[] str2=b.split(": ");
		String c=str2[1];
		System.out.println(c);*/
		if(act.contains(exp)){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
		
	}
	
	
	
}

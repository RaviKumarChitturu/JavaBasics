package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;



public class ObjectMapComparision {
	
	public static Map<Object,Object> getUIPaymentDetailsforCombinePayments() throws Exception
	{
		 Map<Object,Object> map = new HashMap<Object, Object>();
		 Map<Object,Object> m = new LinkedHashMap<Object, Object>();
		 
		String a="a";
		String b="b";
		String c="c";
		String d="d";
		for (int i = 0; i<=2; i++) {
			//ArrayList<Object> al=new ArrayList<>();
		//Map<String,Object> m = new HashMap<String, Object>();
			m.put(a, "aval"+i+"");
			m.put(b, "bval"+i+"");
			m.put(c, "cval"+i+"");
			m.put(d, "dval"+i+"");
			//map.putAll(m);
			System.out.println(m);
		}
		
		//System.out.println(map);
		return m;	
	}	
	
	public static ArrayList<Object> getUIPaymentDetailsforCombinePayments1() throws Exception
	{
		ArrayList<Object> data = new ArrayList<Object>();
		String a="a";
		String b="b";
		String c="c";
		String d="d";
		for (int i = 2; i<=3; i++) {
			ArrayList<Object> al=new ArrayList<>();	
			al.add(a+i);
			al.add(b+i);
			al.add(c+i);
			al.add(d+i);
			data.add(al);
		}
		//System.out.println(data);
		return data;	
	}
	
	public static ArrayList<Object> getOnetoAllUmatchedInArrayComparision(ArrayList<Object> a, ArrayList<Object> b) throws Exception
	{


		ArrayList<Object> unmatched= new ArrayList<>();
		ArrayList<Object> apparray= new ArrayList<>();
		ArrayList<Object> refarray= new ArrayList<>();
		apparray.add(a);
		refarray.add(b);

		Iterator<Object> itr=apparray.iterator();

		for(; itr.hasNext();){
			Object elem= itr.next();
			if(refarray.remove(elem)){
				itr.remove();
			}
		}
		if(apparray.isEmpty()
				&& refarray.isEmpty()){
			System.out.println("Application and Reference Data is matched");
		}
		else{
			System.out.println("unmatched Application Data"+" "+a);
			System.out.println("unmatched reference Data"+" "+b);
			unmatched.addAll(refarray);
			unmatched.addAll(apparray);

		}
		return unmatched;
	}	
	
	public static ArrayList<Object> getUmatchedInBothArrayComparision(ArrayList<Object> array1, ArrayList<Object> array2) throws Exception
	{
		ArrayList<Object> UnmatchedArray = new ArrayList<Object>();
		
		

		for(Iterator<Object> itr = array1.iterator(); itr.hasNext();)
		{
			Object elm = itr.next(); //clearInvalidCharacters(itr.next());//.replaceAll("[^\\n\\r\\t\\p{Print}]", "");		    
			if(array2.remove(elm))
			{
				itr.remove();	
			}
			else{
				System.out.println("Below values are not matched");
				System.out.println("Actual Value is"+" "+  array1);
				System.out.println("Expected Value is"+" "+  array2);
			}
		}

		UnmatchedArray.addAll(array1);
		UnmatchedArray.addAll(array2);
		System.out.println("Unmatched Data in Both Array Comparision are - " + UnmatchedArray);
		return  UnmatchedArray;
	}
	
	
	public static void main(String[] args) throws Exception {	
		Map<Object, Object> a=getUIPaymentDetailsforCombinePayments();
		//System.out.println(a);
		//ArrayList<Object> b=getUIPaymentDetailsforCombinePayments1();
		//System.out.println(b);
		//getOnetoAllUmatchedInArrayComparision(a,b);
		//getUmatchedInBothArrayComparision(a,b);
	}

	
	

}

package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class ArrayCompare {
	
	public ArrayList<String> array1;
	public ArrayList<String> array2;

	public ArrayList<String> isFullArrayMatchWithData(ArrayList<String> Array,String Data)
	{
		ArrayList<String> data = new ArrayList<String>();
		for(int i=0;i<Array.size();i++)
		{
			if(!Array.get(i).contentEquals(Data))
			{
				System.out.println("The Missmatch occured at record no " + i + " and displayed record is " + Array.get(i));
				data.add(Array.get(i));
			}
		}
		return data;
	}
	
	public ArrayList<String> getUmatchedInArrayComparision(ArrayList<String> array1, ArrayList<String> array2) throws Exception
	{
		ArrayList<String> UnmatchedArray = new ArrayList<String>();
		if(array1!=null && array2!=null &&array1.size()>0&&array2.size()>0 && array1.size()==array2.size()){
			for(int i=0;i<array1.size();i++)
			{
				if(!((array1.get(i)).contentEquals(array2.get(i))))
					UnmatchedArray.add(array1.get(i));	
			}
		}
		else{
			throw new Exception("Arrya Sizes are not matched");
		}
		System.out.println("The unmatched array elements are "+UnmatchedArray);
		
		return UnmatchedArray;			
	}


	public static ArrayList<String> getOnetoAllUmatchedInArrayComparision(ArrayList<String> array1, ArrayList<String> array2) throws Exception
	{


		ArrayList<String> unmatched= new ArrayList<>();
		ArrayList<String> apparray= new ArrayList<>();
		ArrayList<String> refarray= new ArrayList<>();
		apparray.addAll(array1);
		refarray.addAll(array2);

		Iterator<String> itr=apparray.iterator();

		for(; itr.hasNext();){
			String elem= itr.next();
			if(refarray.remove(elem)){
				itr.remove();
			}
		}
		if(apparray.isEmpty()
				&& refarray.isEmpty()){
			System.out.println("Application and Reference Data is matched");
		}
		else{
			System.out.println("unmatched Application Data"+" "+array1);
			System.out.println("unmatched reference Data"+" "+array2);
			unmatched.addAll(refarray);
			unmatched.addAll(apparray);

		}
		return unmatched;
	}	



	public boolean isArrayHavingSameData(ArrayList<String> array1)
	{
		ArrayList<String> UnmatchedArray = new ArrayList<String>();
		for(int i=0;i<array1.size();i++)
		{
			if(!((array1.get(0)).contentEquals(array1.get(i))))
				UnmatchedArray.add(array1.get(i));	
		}
		if(UnmatchedArray.size()==0)
		{
			return true;
		}
		else
			return false;
	}

	

	public ArrayList<String> getUmatchedInBothArrayComparision(ArrayList<String> array1, ArrayList<String> array2) throws Exception
	{

		/*array1.removeAll(Arrays.asList("", null));
		array2.removeAll(Arrays.asList("", null));
		System.out.println("After Removing the nulls and spaces"+array1);
		System.out.println("After Removing the nulls and spaces"+array2);*/
		this.array1 = new ArrayList<String>();
		this.array2 = new ArrayList<String>();
		ArrayList<String> UnmatchedArray = new ArrayList<String>();
		this.array1.addAll(array1);
		this.array2.addAll(array2);


		for(Iterator<String> itr = this.array1.iterator(); itr.hasNext();)
		{
			String elm = itr.next(); //clearInvalidCharacters(itr.next());//.replaceAll("[^\\n\\r\\t\\p{Print}]", "");		    
			if(this.array2.remove(elm))
			{
				/*String elem= itr.next().toString();
				System.out.println(elem);*/
				itr.remove();	
			}
			else{
				System.out.println("Below values are not matched");
				System.out.println("Actual Value is"+" "+  elm);
			}
		}

		UnmatchedArray.addAll(this.array1);
		UnmatchedArray.addAll(this.array2);
		System.out.println("Unmatched Data in Both Array Comparision are - " + UnmatchedArray);
		return  UnmatchedArray;
	}

	public ArrayList<String> SplitString(String splitval,String strinval) throws Exception{
		ArrayList<String >ActualReferences = new ArrayList<>();
		String reference[]= strinval.split(splitval);
		//String reference[] = strinval.split(".");
		for(int i=0; i<reference.length;i++){
			//WebPage.SetMesage("Spppppppppppppppp........."+strarray[i]);
			ActualReferences.add(reference[i].trim());
		}
		//System.out.println(ActualReferences+".............");
		return ActualReferences;
	}
	
	
	public static void main(String[] args) throws Exception {
		
		ArrayCompare ar=new ArrayCompare();
		//ArrayList<String> a=ar.SplitString(",","kesi,jp");
		//System.out.println(a);
		
		ArrayList<String> al1= new ArrayList<String>();
		al1.add("hi");
        al1.add("How");
        al1.add("Good");
        ArrayList<String> al2= new ArrayList<String>();
        al2.add("hi");
        al2.add("Good");
        al2.add("How");	
        al2.add("Test");	
        //System.out.println(ar.getUmatchedInArrayComparision(al1, al2));
        System.out.println(al1.size());
        System.out.println(al2.size());
        System.out.println(getOnetoAllUmatchedInArrayComparision(al1, al2));
		

	}

}

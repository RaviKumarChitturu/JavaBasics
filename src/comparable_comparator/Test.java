package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
public class Test implements Comparable<Test> {
	
	String TestName;
	
	Test(String TestName ){
		this.TestName=TestName;
	}

	@Override
	public int compareTo(Test o) {
		// TODO Auto-generated method stub
		return TestName.compareTo(o.TestName);
	}
	
	public static void main(String[] args) {
		ArrayList<Test> al=new ArrayList<>();
		al.add(new Test("Ravi"));
		al.add(new Test("Patel"));
		
		Collections.sort(al);
		
		for (Test test : al) {
			System.out.println(test.TestName);
			
		}
		
		
		
	}

}
*/

public class Test {

	
	private String TestName;
	private String TestID;
	
	Test(String TestName,String TestID ){
		this.TestName=TestName;
		this.TestID=TestID;
	}

	public String getTestName() {
		return TestName;
	}

	public void setTestName(String testName) {
		TestName = testName;
	}

	public String getTestID() {
		return TestID;
	}

	public void setTestID(String testID) {
		TestID = testID;
	}
	
	public static void main(String[] args) {
		ArrayList<Test> al=new ArrayList<>();
		al.add(new Test("Ravi","101"));
		al.add(new Test("Patel","102"));
		//Collections.sort(al,new TestID());
		//Collections.sort(al, Comparator.comparing(Test::getTestID));
		for (Test test : al) {
			System.out.println(test.getTestID()+" "+test.getTestName());
		}
	}
	
}

class TestName implements Comparator<Test>{

	@Override
	public int compare(Test o1, Test o2) {
		// TODO Auto-generated method stub
		return o1.getTestName().compareTo(o2.getTestName());
	}
	
}
class TestID implements Comparator<Test>{

	@Override
	public int compare(Test o1, Test o2) {
		// TODO Auto-generated method stub
		return o1.getTestID().compareTo(o2.getTestID());
	}
	
}



package collections;

import java.util.HashMap;

public class AccessingMap {

	static HashMap<String, Double> ScoreMap = new HashMap<String, Double>();

	public static void Second(int i) {	 	         
		ScoreMap.put("A"+i+"", 1.0);	 
		ScoreMap.put("B"+i+"", 2.0);	 
		ScoreMap.put("C"+i+"", 3.0);
		
	}
	
	
	
public static void main(String[] args) {
	for (int i = 1; i < 5; i++) {
		Second(i);	
	}
	
	//getHashMap("Testing");
}

}

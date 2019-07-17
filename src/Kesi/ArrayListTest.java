package Kesi;

import java.util.ArrayList;

public class ArrayListTest {

	  
    public static void main(String args[]) {

        // ArrayList to be converted into String
        ArrayList<String> language = new ArrayList<String>();
        language.add("HashSet");
        language.add("LinkedList");
        language.add("Vector");
        System.out.println("String created: " + language);
        // Converting ArrayList to String in Java using advanced for-each loop
        StringBuilder sb = new StringBuilder();
        for(String str : language){
            sb.append(str).append(","); //separating contents using semi colon
        }
      
        String List = sb.toString();
        System.out.print("String created: " + List.trim());
    }
}

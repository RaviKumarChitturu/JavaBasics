package practice;

import java.math.BigDecimal;
import java.util.Calendar;

public class GetClassName {

	public static void main(String[] args) {
		Class clazz = String.class;
		System.out.println("Class Name: " + clazz.getName());

		clazz = Calendar.class;
		System.out.println("Class Name: " + clazz.getName());

		clazz = BigDecimal.class;
		System.out.println("Class Name: " + clazz.getName());

	}

}

package comparable_comparator;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getAge()-emp2.getAge();
	}

}

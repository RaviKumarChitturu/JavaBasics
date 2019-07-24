package a.arrays;
/* 5. Write java programs by following below steps:
Step1 : Create employee class with following details:  class Name: Employee,  employee details:  emp_ID, emp_Name, emp_dept  and Initialize these three variables with parametrized constructor
Step2:  Create one more class and declare single dimension array with data type is Employee, initialize it by passing employee objects.
Step3:  print all employee detail by iterating this array.*/

public class Employee2{
 
		
		
			public static void main(String[] args) {
				/*Employee2another emp[]={new Employee2another(111,"Ravi","QA"),new Employee2another(112,"Patel","QA")};
				for (Employee2another employee : emp) {
					System.out.println("Employee details:"+employee.empdept+";"+employee.empID+";"+employee.empName);
					
				}*/
				
				Employee2another e=new Employee2another(111,"Ravi","QA");
				System.out.println(e.empdept);
			}
	
}

 class Employee2another{

	int empID;
	String empName;
	String empdept ;
		
	public Employee2another(int empID,String empName,String empdept  ){
		this.empID=empID;
		this.empdept=empdept;
		this.empName=empName;
			/*System.out.println(empID);
		System.out.println(empName);    // for local variable 
		System.out.println(empdept);*/
			}
	
	}
	


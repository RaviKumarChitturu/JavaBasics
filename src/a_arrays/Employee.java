package a_arrays;
class Employee1{
    int emp_Id;
    String emp_Name, emp_dept;

    Employee1 (int emp_Id, String emp_Name,String emp_dept)
    {
         this.emp_Id =emp_Id;
         this.emp_Name = emp_Name;
         this.emp_dept = emp_dept;
    }
    void printData(){
         System.out.println("Employee Id:"+emp_Id+","+"Employee name:"+emp_Name+","+"Department:"+emp_dept);
    }
}
public class Employee{
         static Employee1[] e={new Employee1(1,"aaaa","fsf"),new Employee1(2,"bbb","fsfv")};     
         public static void main(String[] args){
        
         for(int i=0;i<e.length;i++){
             e[i].printData();
        }
                                    
}
}


/* 5. Write java programs by following below steps:
Step1 : Create employee class with following details:  class Name: Employee,  employee details:  emp_ID, emp_Name, emp_dept  and Initialize these three variables with parametrized constructor
Step2:  Create one more class and declare single dimension array with data type is Employee, initialize it by passing employee objects.
Step3:  print all employee detail by iterating this array.

public class Employee{
	int empID;
	String empName;
	String empdept ;
		
	public Employee(int empID,String empName,String empdept  ){
		this.empID=empID;
		this.empdept=empdept;
		this.empName=empName;
			}
	public static void main(String[] args) {
		Employeeanother ed=new Employeeanother();
		ed.Employeedeatails();
	}
}

class Employeeanother {
	void Employeedeatails(){
	Employee e[]=new Employee[2];
	{
		 e[0]=new Employee(111,"Ravi","QA");
		 e[1]=new Employee(112,"Patel","QA");}
		for (int i = 0; i < emp.length; i++) {
		System.out.println("Employee details:"+emp[i].empdept+";"+emp[i].empID+";"+emp[i].empName);
	}
		
		Employee emp[]={new Employee(111,"Ravi","QA"),new Employee(112,"Patel","QA")};
		for (Employee employee : emp) {
			System.out.println("Employee details:"+employee.empdept+";"+employee.empID+";"+employee.empName);
			
		}
	}
	
}
*/
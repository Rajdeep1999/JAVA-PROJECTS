package LabTest1;

public class EmployeeMain {
  
	public static void main(String[]args)
	{
		Employee n=new Employee();
		n.eid=36;
		n.dep="Marketing";
		n.sal=34786;
		
		Employee n1=new Employee(37,"Marketing",38902);
		System.out.println("Employee 1");
		n.display();
		
		System.out.println("Employee 2");
		n1.display();
	}
}

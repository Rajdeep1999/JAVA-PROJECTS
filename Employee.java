package LabTest1;

public class Employee 
{
  int eid;
  String dep;
  double sal;
  
  public Employee() {
  }
	  public Employee(int eid,String dep,double sal) {
		  this.eid=eid;
		  this.dep=dep;
		  this.sal=sal;
	  }
	  public void display() {
		  System.out.println("Employee ID: "+eid);
		  System.out.println("Department: "+dep);
		  System.out.println("Salary: "+sal);
	  }
}
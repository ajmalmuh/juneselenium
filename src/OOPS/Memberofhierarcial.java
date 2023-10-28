package OOPS;

class Member
{
	String name,address;
	int age,salary;
	int phno;
	public void printdetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("address="+address);
		System.out.println("phno="+phno);
		System.out.println("salary="+salary);
	}
}
	class Employee1 extends Member
	{
		String specialization;
	}
    class Manager extends Member
    {
    	String department;
    }
public class Memberofhierarcial 
{
			
	


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
          Employee1 ob=new Employee1();
          ob.name="Ajmal";
          ob.age=25;
          ob.phno=85;
          ob.salary=50000;
          ob.address="abc";
          ob.printdetails();
          
			System.out.println(ob.specialization="java");
		    Manager od=new Manager();
		    
		    System.out.println(od.department= "Computer Application");
	}
}



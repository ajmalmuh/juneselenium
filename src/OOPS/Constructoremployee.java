package OOPS;

public class Constructoremployee {
	int empid;
	String empname;
	String empdesignation;
	
	public Constructoremployee(int empid, String empname, String empdesignation)
	{
		this.empid=empid;
		this.empname=empname;
		this.empdesignation=empdesignation;
		
	}
    public void display()
    {
    	System.out.println("empid="+empid);
    	System.out.println("empname="+empname);
    	System.out.println("empdesignation="+empdesignation);
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Constructoremployee emp1=new Constructoremployee(101,"ac","Tester");
       
       emp1.display();
       
       Constructoremployee emp2=new Constructoremployee(102,"abc","Tester");
       emp2.display();
       
       
	}

}

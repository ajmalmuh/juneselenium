package OOPS;

public class Staticfinal {
	String empname;
	static String companyname="Luminar";
	final static float pi=3.14f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticfinal ob=new Staticfinal();
		System.out.println(ob.empname);
		System.out.println(companyname);
		System.out.println(companyname="luminartechnolab");
		System.out.println(companyname);
		System.out.println(pi);

	}

}

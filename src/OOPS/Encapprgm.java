package OOPS;
 class employee{
	

private String name;
private String designation;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}

}

public class Encapprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee ob=new employee();
		ob.setName("ajmal");
		System.out.println(ob.getName());
		
		

	}

}

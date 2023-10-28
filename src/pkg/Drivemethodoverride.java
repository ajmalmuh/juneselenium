package pkg;
class Vehicle
{
	public void drive()
	{
		System.out.println("drive");
		
	}
}
	class Car extends Vehicle
	{
	@Override
	 public void drive() {
		System.out.println("Repairing a car ");
		super.drive();
	}
	
}
public class Drivemethodoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.drive();

	}


}

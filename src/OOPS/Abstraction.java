package OOPS;
abstract class Car
{
abstract public void acceleration();
abstract public void speedlimit();

public void musicSystem()
{
	System.out.println("music");
}
}
class Bmw extends Car
{

	@Override
	public void acceleration() {
	{
		System.out.println("Bmw acceleration");
	}
		
	}

	@Override
	public void speedlimit() {
		{
			System.out.println("Bmw speedlimit");
		}
		
	}

}
class Kia extends Car
{

	@Override
	public void acceleration() {
		System.out.println("Kia acceleration");
	}

	@Override
	public void speedlimit() {
		System.out.println("Kia speedlimit");
	}
	
}

public class Abstraction {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bmw ob=new Bmw();
ob.acceleration();
ob.speedlimit();
ob.musicSystem();

	}

}

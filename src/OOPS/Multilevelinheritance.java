package OOPS;
class Animal {
 public  void animalfood()
 {
	 System.out.println("animalfood");
 }
}
class Dog extends Animal
{
	public void dogDetails()
	{
		System.out.println("dogDetails");
	}
}
class Babydog extends Dog
{
	public void babyDogdetails()
	{
		System.out.println("babyDogdetails");
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babydog b=new Babydog();
	    b.babyDogdetails();
	    b.dogDetails();
		b.animalfood();
		

	}

}

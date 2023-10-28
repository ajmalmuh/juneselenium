package OOPS;
interface Calc
{
	public void add();
	public void sub();
}
interface AdvanceCalc
{
	public void squareroot();
	
}
class Calculator implements Calc,AdvanceCalc
{

	

	@Override
	public void add() {
		{
		System.out.println("add");
	    }
	}
	@Override
	public void sub() 
		{
		System.out.println("sub");
		
	}
		@Override
		public void squareroot() 
			{
				System.out.println("squareroot");
			}
			
		
	
}



public class Interfacepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator ob=new Calculator();
ob.add();
ob.sub();
ob.squareroot();
	}

}









package OOPS;

class Parent {
	int a=20,b=50;
	public void mul()
	{
		System.out.println("mul");
	}
}
class Child extends Parent
{
	public void div()
	{
		System.out.println("div");
	}
}
public class singlelevelinheritance {
	public static void main(String[] args) {
	Child c=new Child();
	c.mul();
	c.div();
	System.out.println(c.a);
	System.out.println(c.b);
 }
}

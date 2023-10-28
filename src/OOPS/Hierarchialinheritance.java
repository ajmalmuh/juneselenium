package OOPS;
class A { 
	Accessmodifiers ob1=new Accessmodifiers();
	
	public void amethod()
	{
		System.out.println("a");
	}
}
class B extends A
{
	public void b()
	{
		System.out.println("bmethod");
	}
}
class C extends A
{
	public void c()
	{ 
		System.out.println("c method");
	}
}

public class Hierarchialinheritance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmodifiers ob2=new Accessmodifiers();

        C ob=new C();
        ob.c();
        ob.amethod();
        B ob1=new B();
        ob1.b();
        ob1.amethod();
        ob2.b=6;        
        
        
	}

}

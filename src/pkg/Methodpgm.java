package pkg;

import java.util.Scanner;

public class Methodpgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Methodpgm ob=new Methodpgm();
		int a=sc.nextInt();
		int b=sc.nextInt();
		ob.add();
        ob.sub();
        int c=ob.mul(a,b);
        System.out.println(c);
        double div=ob.div(a,b);
        System.out.println(div);
	}

	//method without returntype and without parameter
	public void add()
	{
		int a=10,b=40,c;
		c=a+b;
		System.out.print(c);
	}
	 
    //method with returntype and without parameter
     public int sub()
     {
    	 int a=30,b=15,c;
    	 c=a-b;
    	 System.out.println(c);
    	 return c;
    	
     }
     
     //method without returntype and with parametr
     public int mul(int a, int b)
     {
        int c=a*b;
        return c;
		
     }

     //method with returntype and with parameter
       public double div(int a, int b)
       {
    	double d=a/b;
    	return d;
       }
     
}








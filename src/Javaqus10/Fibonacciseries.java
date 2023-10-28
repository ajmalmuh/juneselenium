package Javaqus10;

public class Fibonacciseries {

	public static void main(String[] args) {
		// Q7
		
		int n=20,a=0,b=1;
		
		System.out.println("Fibanocci series till "+n);
		
		for(int i=1;i<=n;i++)
		{
			System.out.println(a+",");
			
			int c=a+b;
			a=b;
			b=c;
		}

	}

}

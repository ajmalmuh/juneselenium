package pkg;

import java.util.Scanner;

public class Arraycountofdigits {
	public static void main(String[] args) {
		System.out.println("enter a number");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int rem,count=0;
		while(a>0)
		{
			rem=a%10;
			a=a/10;
			count++;
			
		}
		System.out.println(count+" digits ");
	}

	
	
}

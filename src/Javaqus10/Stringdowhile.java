package Javaqus10;

import java.util.Scanner;

public class Stringdowhile {
	public static void main(String[] args) {
	// Q3
		int sum=0;
		char ch;
		do {
		System.out.println("enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sum=a+b;
		System.out.println("sum="+sum);
		System.out.println("do you want to continue/(Y/N)");
		ch=sc.next().charAt(0);
		} while(ch=='Y' ||ch== 'y');
		 
		  
		  
		
	}
}

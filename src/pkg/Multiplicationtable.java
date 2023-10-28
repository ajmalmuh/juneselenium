package pkg;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		System.out.println("Enter numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<=10;i++)
		{
			System.out.print(i+"*"+n+"="+(i*n));
		}
		

	}

}

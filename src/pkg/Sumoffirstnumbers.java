package pkg;

import java.util.Scanner;

public class Sumoffirstnumbers {

	public static void main(String[] args) {
		System.out.println("Read 10 natural numbers ");
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[10];
		int sum=0;
		
		 for(int i=0;i<10;i++)
		 {
			   ar[i]= sc.nextInt();
			   sum=sum+ar[i];
	
		 }
		 System.out.println("sum ="+sum);
		 
	}

}

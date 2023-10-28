package Javaqus10;

import java.util.Scanner;

public class Naturalnossum {
	

	
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter n numbers");
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		
		
		for(int i=0;i<n;i++)
		{
			sum=sum+ar[i];
		}
			System.out.println("sum is "+sum);
		
		
             		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		}

}

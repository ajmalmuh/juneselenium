package pkg;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
		System.out.println("enter numbers");
		Scanner sc=new Scanner(System.in);
		String[] ar=new String[2];
		 for(int i=0; i<2; i++)
		 {
			   ar[i]= sc.next();
		 }
		 System.out.print("entered numbers=");
		 for(int i=0; i<2; i++)
		 {
			 System.out.println(ar[i]);
		 }

	}

}

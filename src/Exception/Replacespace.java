package Exception;

import java.util.Scanner;

public class Replacespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in); 
		String s1=sc.nextLine();
		System.out.println(s1.replace(" ", "-"));
	}

}

package Javaqus10;

import java.util.Scanner;

public class Stringpalindrom {

	public static void main(String[] args) {
		//Q10
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n Enter The String: ");
		String s=sc.nextLine();
		String rev_string="";
		
		for (int i=s.length()-1;i>=0;i--)
		{
			rev_string=rev_string+s.charAt(i);
		}
	    if(rev_string.equals(s))
	    {
	    	
	    	System.out.println("Palindrome");
	    }
	    else
	    {
	    	System.out.println("Not Palindrome");
	    }
	
	}

}

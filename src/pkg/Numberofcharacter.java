package pkg;

import java.util.Scanner;

public class Numberofcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int c=0;
		  System.out.print("enter the string");
		  Scanner sc=new Scanner(System.in);
		  String a=sc.nextLine();
		  
		  for(int i=0;i<a.length();i++)
		  {
			  if(a.charAt(i)!=0)
			  {
				  c++;
			  }
				  
		  }
		  System.out.println(c);
	      }
	}



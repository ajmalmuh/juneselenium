package Javaqus10;

import java.util.Scanner;

public class Armstrongnumberornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Q6
		
		int sum =0, rem=0,temp;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a 3 digit number");
	    int num=sc.nextInt();
	    
	    temp=num;
	    
	    while(num>0)
	    {
	    	rem=num%10;
	    	sum=sum+(rem*rem*rem);
	    	num=num/10;
	    }
	    
	     if(temp==sum)
	     {
	    	 System.out.println(+ temp +" is an Armstrong Number" );
	     }
	     else
	     {
	    	 System.out.println(+ temp +" is not an Armstrong Number");
	     }
	    
	}

}

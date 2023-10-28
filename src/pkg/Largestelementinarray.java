package pkg;

import java.util.Scanner;

public class Largestelementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("Enter 5 numbers");
         Scanner sc=new Scanner(System.in);
         int[] arr=new int[5];
         for (int i=0;i<5;i++)
         {
        	 arr[i]=sc.nextInt();
         }
	      int largest=arr[0];
	      for(int i=1;i<5;i++)
	      {
	    	  if (largest <arr[i])
	    	  {
	    		  largest=arr[i];
	    	  }
	      }
	    		  
	System.out.println("largest"+largest);

   }
}
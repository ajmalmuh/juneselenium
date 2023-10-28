package Javaqus10;

import java.util.Scanner;

public class Countpositivenegative {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Q4
	
	int[] ar=new int[4];
    int pos=0;
    int neg=0;
    int z =0;
    System.out.println("enter 4 numbers");
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<4;i++)
    	
    {
    	ar[i]=sc.nextInt();
    }
     for(int j=0;j<4;j++)
     {
    	if(ar[j]>0)
    	{
    		pos++;
    	}
    	else if(ar[j]<0)
    	{
    		neg++;
    	}
    	else
    	{
    		z++;
    	}
     }
    	System.out.println("positive numbers"+pos);
    	System.out.println("negative numbers"+neg);
    	System.out.println("zeros"+z);
    	
	}

}

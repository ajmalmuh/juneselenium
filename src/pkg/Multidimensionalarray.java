package pkg;

import java.util.Scanner;

public class Multidimensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter numbers:");
		int[][] ar=new int[3][2];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}	
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<2;j++)
				{	
				System.out.print(ar[i][j]+" ");
				}
			    System.out.println();
				
      }			

	}

}

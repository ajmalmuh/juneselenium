package pkg;

import java.util.Scanner;

public class Calculaterswitchprgrm {

	public static void main(String[] args) {
		char ch;
		do {
		System.out.println("enter 2 numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter your choise- 1.addision,2.subtraction,3.multiplication,4.division");     
        int choise=sc.nextInt();
        double result=0;
		switch(choise)
		{
		case 1:result=a+b;
		break;
		case 2:result=a-b;
		break;
		case 3:result=a*b;
		break;
		case 4:result=a/b;
		break;
		
		default:System.out.println("invalid choise");
		}
		System.out.println("result is  "+result);
		System.out.println("do you want to continue?Y/N");
		 ch=sc.next().charAt(0);
		}while(ch=='Y'||ch=='N');
	
	}
}

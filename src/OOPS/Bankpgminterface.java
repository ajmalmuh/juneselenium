package OOPS;

import java.util.Scanner;

interface Bank
{
	public void accountDetails();
	public void balance();
	public void deposit();
	public void withdrawl();
}

class FB implements Bank
{
int balance= 2000;
int deposit=500;
int withdrawl=1000;
static String bankname="FB";
Scanner sc=new Scanner(System.in);
	@Override
	public void accountDetails() {
		System.out.println("enter your name");
		//Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.println("enter your account No");
		int accNo=sc.nextInt();
		System.out.println("name is"+name);
		System.out.println("account No. is"+accNo);
		System.out.println("bank name is"+bankname);
		
	}

	@Override
	public void balance() {
		System.out.println("balance is "+balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("enter the amt to be deposit  ");
		//Scanner sc=new Scanner(System.in);
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("balance is "+balance);
	}

	@Override
	public void withdrawl() {
		System.out.println("enter the amt to be withdrawl ");
		//Scanner sc=new Scanner(System.in);
		withdrawl=sc.nextInt();
		balance=balance-withdrawl;
		System.out.println("balance is "+balance);
	}
	
}
public class Bankpgminterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FB f=new FB();
f.accountDetails();
f.balance();
f.deposit();
f.withdrawl();
	}

}

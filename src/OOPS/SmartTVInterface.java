package OOPS;

import java.util.Scanner;

interface TVremote
{
public void volumeChange();
public void channelChange(); 
//Scanner sc=new (System.in);
}

interface smartTVremote extends TVremote
{
	
	public void wificonnection();
}

	class TV implements smartTVremote {



	@Override
	public void volumeChange() {
		System.out.println("volume");
		
	}

	@Override
	public void channelChange() {
		// TODO Auto-generated method stub
		System.out.println("channel");
	}

	@Override
	public void wificonnection() {
		// TODO Auto-generated method stub
		System.out.println("wifi");	
	}
	}
	
public	class SmartTVInterface
	{
	public static void main(String[] args) {
TV t=new TV();	
t.volumeChange();
t.channelChange();
t.wificonnection();

}
	}
	

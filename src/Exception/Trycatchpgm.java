package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Trycatchpgm {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		try {
			FileInputStream ob = new FileInputStream("E://filename.xlxs");
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("filenotexeption");
		}
		try {
			int a = 15, b = 0;
			double c = a / b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("arithametic exeception");
			System.out.println(e.getMessage());

		}
	

		int[] ar = new int[2];
		ar[0] = 23;
		try {
			System.out.println(ar[3]);

		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("array indexbound exception ");
		}
	}
}
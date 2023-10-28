package pkg;

public class Jumpingstatementsprgrm {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				  break;
			    //continue;
			}
			System.out.println(i);
		}
		int v=sum();
		System.out.println(sum());
		
		}
public static int sum()
{
	int a=10,b=20,c;
	c=a+b;
	return c;
}


}

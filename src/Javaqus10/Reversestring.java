package Javaqus10;

public class Reversestring {
	public static void main(String[] args) {
		
      //Q8
       
		
		String s1="Testing Training Center ";
		System.out.println(s1);
		String[]str=s1.split(" ");
		 System.out.println();
        
        for(int i=str.length-1;i>=0;i--)
        {
       	 System.out.print(str[i]+" ");
        }
	}
}
	

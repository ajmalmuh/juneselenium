package pkg;

public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//concat
		         
	             String s1="hello welcome to luminar";
	             String s2="welcome";
	             System.out.println(s1.concat(s2));//hellowelcome
	             System.out.println(s1+s2);//hellowelcome
	             System.out.println(1+3+s1+4+5);//4hello45
//equals
	             System.out.println(s1.equals(s2));
	             System.out.println(s1.equalsIgnoreCase(s2));
	             
//tolower and toupper
	             System.out.println(s1.toLowerCase());
	             System.out.println(s2.toUpperCase());
	             
//contains
	             System.out.println(s1.contains("welcome"));
	             
//length
	             System.out.println(s1.length());
	             
//startswith
	             System.out.println(s1.startsWith("hello1"));
	             
//endwith
	             System.out.println(s1.endsWith("luminar"));
	             
//substring
	             System.out.println(s1.substring(0,3));
	             
//trim
	             System.out.println(s2.trim());
	             
//split
	             
	             String[]st = s1.split(" ");
	             
	             for(String v:st)
	             {
	            	 System.out.println();
	             }
	             
//replace
	                System.out.println(s2.replace("welcome","hai"));
	                
//charAt
	                System.out.println(s1.charAt(2));
	             
	}

}

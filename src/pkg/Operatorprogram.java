package pkg;

public class Operatorprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//Arithametic operators
		int a=20,b=10;
		System.out.println("-------arithametic operators-------");
		System.out.println("a+b="+(a+b));//30
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		//Assignment operators(=,+=,-=)
		System.out.println("------assignment operators------");
		System.out.println(a=b);//10
		System.out.println("a+=");
		
		//Relational operators

		System.out.println("-------Relational operators------");
		int c=30,e=18;
		System.out.println(c>e);
		System.out.println(c>=e);
		System.out.println(c<e);
		System.out.println(c<=e);
		System.out.println(c==e);
		System.out.println(c!=e);
				
				//logical operators

		String username="ajmal";
				String pswd="ajmal123";
				System.out.println("--------logical-----");
				
				System.out.println((username=="ajmal") && (pswd=="ajmal123"));
				System.out.println((username=="ajmal1")||(pswd=="ajmal123"));
				System.out.println(!(username=="abc1"));
				
				
				
	//++			increment operator  // increment by 1
	//			postincrement b++	//increment by 1
	//			preincrement ++b
				
	//-- decrement operators //decrement by 1
				System.out.println("---------Unary operators------");
		int d=5;
		System.out.println(d++); //5
		System.out.println(d);//6
		System.out.println(++d);//7
		
		
System.out.println("-----------ternary operator---------");
int num1=20,num2=25;

//condition/expression1:expression2;
 String value   =num1>num2?"num1 is greater":"num2 is greater";
 System.out.println(value);
 
 String v   =num1<num2?"num1 is lesser":"num2 is greater";
 System.out.println(v);
 
 
	}

}

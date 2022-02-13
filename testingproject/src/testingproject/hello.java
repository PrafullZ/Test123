package testingproject;

public class  hello {//Execution

public static void main(String[]args)
      {
	 		int a=25;
	 		int b=65;
	 		System.out.println("before swapping..." +  a);
	 		System.out.println("before swapping..." +  b);

	 		a=a+b;
	 		b=a-b;
	 		a=a-b;
	 		System.out.println("after swapping..." +  a);
	 		System.out.println("after swapping..." +  b);

	 	System.out.println("---------------------------------");

		int c=78;
		int d=67;

		System.out.println("Before swapping...." + c + " " + d);

		int e=c;
		c=d;
		d=e;
		System.out.println("after swapping...." + c + " " + d);

		System.out.println("=================================");
		
		int t [] = { 40,45,50,60,70 };
		
		System.out.println(t[3]);
		
		//t[0]<t[1]<t[2]<t[3],t[4]
		
		
	
	    
      }
	
     }



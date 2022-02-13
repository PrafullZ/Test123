package testingproject;

public class demo {
	
	public static void main(String[]args)
	{
		for(int a=1;a<=6;a++)
		{
          for(int b=1;b<=a;b++)
          {
        	  System.out.print("*");
          }
          for(int c=1; c<=2*(6-a);c++)
          {
        	  System.out.print(" ");
          }
          for(int d=1; d<=a;d++)
          {
        	  System.out.print("*");
          }
         

          System.out.println();        	  
      
		}
		

		for(int a=5;a>=1;a--)
		{
          for(int b=1;b<=a;b++)
          {
        	  System.out.print("*");
          }
          for(int c=1; c<=2*(6-a);c++)
          {
        	  System.out.print(" ");
          }
          for(int d=1; d<=a;d++)
          {
        	  System.out.print("*");
          }
         

          System.out.println();        	  
      
		}
		
	
	}
}

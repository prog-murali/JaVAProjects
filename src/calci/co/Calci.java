package calci.co;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Calci 
{
	public static void main(String[] args)
	{
		//Storing to numbers
		double a =0;
	    double b =0;
		boolean exit=true;
		int loop=0;
		
		DecimalFormat df=new DecimalFormat();
		
		//Getting i/p from User:
		Scanner sc = new Scanner(System.in);
		// i/p's:
		while(exit)
		{
			System.out.println("*************************************************************************");
			System.out.println("****************** WELCOME TO SIMPLE CALCI APPLICATION ******************");
			System.out.println("*************************************************************************");
			System.out.println();
			System.out.println("Enter 1 to START");
			System.out.println("Enter 2 to STOP");
			loop = sc.nextInt();
		    
			if(loop==1)
			{
				System.out.println("Enter First Number: ");
				try
				{
					a = sc.nextDouble();
				}
				catch (Exception e) 
				{
					System.out.println("Invalid input! Please enter a valid number.");
				}
				System.out.println("Enter Second Number: ");
				try
				{
					b = sc.nextDouble();
				}
				catch (Exception e) 
				{
					System.out.println("Invalid input! Please enter a valid number.");			
				}
				
				//Calci Opertaions
				int operation =0;
				
				System.out.println("Enter the operator need to perform:");
				System.out.println();
				System.out.println(" 1. TO PERFORM Addition(+)");
			    System.out.println(" 2. TO PERFORM Subtraction(-)");
			    System.out.println(" 3. TO PERFORM Multiplication(*)");
				System.out.println(" 4. TO PERFORM Division(/)");
				System.out.println(" 5. TO PERFORM MODULUS(%)");
				System.out.println(" 6. TO Exit");
				try {
					operation = sc.nextInt();				  	
				}
				catch(Exception e)
				{
					System.out.println("Invalid input! Please enter a valid number.");
				}
				
				switch(operation)
				{
				case 1:
					System.out.println("The Addition of the two numbers: "+a + " + " + b + " = " + (a+b));
					System.out.println();
					break;
					
				case 2:
					System.out.println("The Subtraction of the two numbers: "+a + " - " + b + " = " + (a-b));
					System.out.println();
					break;
					
				case 3:
					System.out.println("The Multiplication of the two numbers: "+a + " * " + b + " = " + (a*b));
					System.out.println();
					break;
					
				case 4:

					try {
						System.out.println("The Division of the two numbers: "+a + " / " + b + " = " + df.format(a/b));							
					}
					catch(ArithmeticException e)
					{
						System.out.println("No number Cant be divided by 0 :-* ");
					}
				
				System.out.println();
				break;
					
				case 5:
					try {
						System.out.println("The Modulus of the two numbers: "+a + " % " + b + " = " + df.format(a%b));							
					}
					catch(Exception e)
					{
						System.out.println("No number Cant be modulus by 0 :-* ");
					}
				
				System.out.println();
				break;
			
				case 6:
					exit=false;							
					System.out.println("****************** THANKS FOR USING CALCI APPLICATION ******************");
					break;
					
				default:
					System.out.println("Invalid input! Please enter a valid Operation.");
					System.out.println();
				
				}
				
		        
			}
		    else if (loop==2)
		    {
		    	System.out.println("****************** THANKS FOR USING CALCI APPLICATION ******************");
				exit=false;
		    }		
			else
			{
				System.out.println("Invalid input! Please enter a valid number.");
			    loop=sc.nextInt();
				System.out.println();
			}   
		}
		sc.close();
	}
}
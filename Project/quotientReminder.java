package Project;

import java.util.Scanner;

public class quotientReminder {

	public static void main(String[] args) {
		int dividend = 25, divisor = 5;
		
		int quotient = dividend/divisor;
		int remainder = dividend%divisor;
		
		System.out.println("quo:" + quotient);
		System.out.println("Rem:" + remainder);
		
		int num; 
	    System.out.println("Enter an Integer number:"); 
	    Scanner input = new Scanner(System.in); 
	    num = input.nextInt();                                          
	 
	    if ( num % 2 == 0 )                                            
		                                                                
	        System.out.println("Entered number is even"); 
	     else 
	        System.out.println("Entered number is odd"); 
	  } 

	}



package Project;

import java.util.Scanner;

public class primeOrNot {

	public static void main(String[] args) {	
		
		int temp;
		Scanner scan= new Scanner(System.in);
		 System.out.println("Enter any number:");
		 //capture the input in an integer
		int num=scan.nextInt();
		 scan.close();
		 for(int i=2;i<=num/2;i++)
		 {
		 temp=num%i;
		 if(temp==0)
		 {
		 break;
		 }
		 else
		 System.out.println(num + " is not a Prime Number");
		 }
		 
		 
	}
	
}



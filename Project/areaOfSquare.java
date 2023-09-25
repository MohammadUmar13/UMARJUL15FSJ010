package Project;

import java.util.Scanner;

public class areaOfSquare {
	
	public static void main(String[] args) {
		System.out.println("Enter Side of Square:");
		 Scanner sc = new Scanner(System.in);
		double s = sc.nextDouble();
		double a = s*s;
		 System.out.println("Area of Square is: "+a); 
	}

}

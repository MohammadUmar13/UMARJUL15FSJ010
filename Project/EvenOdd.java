package Project;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = read.nextInt(); 
        if(n % 2 == 0) 
            System.out.println(n + " is even"); 
        else 
            System.out.println(n + " is odd");

	}

}

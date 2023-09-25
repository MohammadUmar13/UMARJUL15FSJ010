package Project;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0; 
        Scanner s= new Scanner(System.in);     
          
        System.out.println("enter value "); 
        n = s.nextInt(); 
          
        while (n <= 50)  { 
            sum = sum + n; 
            n++; 
        } 
        System.out.format(" Sum of the Numbers: %d ", 
sum);
	}

}

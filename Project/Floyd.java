package Project;

import java.util.Scanner;

public class Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n = 1, c, j; 
       
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the number of rows for floyd's triangle");
             int   rows = input.nextInt(); 
        System.out.println("Floyd's triangle"); 
        System.out.println("_______________"); 
        for (c=1;c<=rows;c++) 
        { 
            for (j=1;j< c;j++) 
            { 
                 System.out.print(n+" "); 
                 //Incrementing the number value 
                 n++; 
            } 
            //For new line 
            System.out.println();
	}

}
}

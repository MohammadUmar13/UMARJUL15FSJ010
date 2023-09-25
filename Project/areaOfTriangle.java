package Project;

import java.util.Scanner;

public class areaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner S1 = new Scanner(System.in);
		 System.out.println("width");  
		 double base = S1.nextDouble();
		 System.out.println("height"); 
		 double height = S1.nextDouble();
		 double area = (base* height)/2;
		 System.out.println("Area of Triangle is: " + area);
	}

}

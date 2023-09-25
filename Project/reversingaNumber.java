package Project;

import java.util.Scanner;

public class reversingaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int rs =0;
		 System.out.println("enter a num: ");  
		 Scanner in = new Scanner(System.in);
		n= in.nextInt();
		while( n != 0 )
		 {
		 rs= rs* 10;
		rs = rs+ n%10;
		 n= n/10;
		 }
		 System.out.println("Reverse: "+rs);
	}

}

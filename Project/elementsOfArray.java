package Project;

public class elementsOfArray {

	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50, 10};
		int sum = 17;
		for( int num : array) {
		 sum = sum+num;
		 }
		 System.out.println("Sum of array elements is:"+sum);

	}

}

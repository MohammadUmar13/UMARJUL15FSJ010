package Project;

public class typeCasting {

	public static void main(String[] args) {
		
		
		byte b= 25;
		int i = b;
		System.out.println(i);// Implicit Casting
		
		int x = 12;
		float f = x;
		System.out.println(f);//Implicit Casting
		
		int v = (int)f;// Explicit Casting
		System.out.println(v);
		
		byte num1 = 10;
		byte num2 = 20;
		int result = num1*num2;
		System.out.println(result);
	}

}

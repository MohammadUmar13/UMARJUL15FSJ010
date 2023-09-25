package Project;

import java.util.Scanner;

public class printInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is Your age?");
        int age = scanner.nextInt();
        System.out.println("What is your name ?");
        String name = scanner.next();
        System.out.printf("Hey %s, How are you?", name);
        String status = scanner.next();
        System.out.println("Fine");
        scanner.close();}

}


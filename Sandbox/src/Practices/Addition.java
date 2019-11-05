package Practices;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		System.out.println("enter two integers");
		int a;
		int b;
		int c;
		Scanner sum = new Scanner(System.in);
		a = sum.nextInt();
		b = sum.nextInt();
		c = a+b;
		System.out.println("addition of two integers is   " + c);
		

	}

}

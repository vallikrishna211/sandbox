package Assingnments;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		
		System.out.println("What is your first number?");
		Scanner input1 = new Scanner(System.in);
		num1 = input1.nextInt();
		System.out.println(num1);
		System.out.println("What is your second number?");
		Scanner input2 = new Scanner(System.in);
		num2 = input2.nextInt();
		System.out.println(num2);
		System.out.println("What is your third number?");
		Scanner input3 = new Scanner(System.in);
		num3 = input3.nextInt();
		System.out.println("num3");
		System.out.println((num1+ "+" +num2+ "+"  +num3+ "+" + "/2" + "is..."));
		System.out.println((num1+num2+num3)/2);




		
		

	}

}

package Assingnments;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2 ;
		int num3;
		
		System.out.println("please enter two numbers");
		
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		num3 = num1*num2;
		
		System.out.println(num1 +"*"+ num2+ "=" + num3);
		

	}

}

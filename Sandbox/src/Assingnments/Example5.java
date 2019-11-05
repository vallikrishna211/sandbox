package Assingnments;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		double weight;
		double height;
		double bmi;
		System.out.println("An example of your output could be:");
		System.out.println("Your weight in kg:");
		Scanner input1 = new Scanner(System.in);
		weight = input1.nextDouble();
		System.out.println(weight);
		System.out.println("Your height in m:");
		Scanner input2 = new Scanner(System.in);
		height = input2.nextDouble();
		System.out.println(height);
		
		bmi = weight/(height*height);
		System.out.println(bmi);
	}

}

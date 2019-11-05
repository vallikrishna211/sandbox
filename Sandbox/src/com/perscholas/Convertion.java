package com.perscholas;

import java.util.Scanner;

public class Convertion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float temperature = input.nextFloat();
		System.out.println("enter temperature in farenheit");
		temperature=(temperature-32)*5/9;
		System.out.println(" temperature in celsius = " + temperature);
		
		
	}
	

}

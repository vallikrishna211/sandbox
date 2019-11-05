package com.perscholas;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		//System.out.println(5%2);
		//System.out.println(7/2);
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		int x = input.nextInt();
		int y = input2.nextInt();
		System.out.println(x+y);
		input.close();
		input2.close();
	}

}

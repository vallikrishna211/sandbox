package com.perscholas;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		 int x = input1.nextInt();
		 int y = input2.nextInt();
		 int z = input3.nextInt();
		 System.out.println(x-y-z); 
		 input1.close();
		 input2.close();
		 input3.close();

	}

}

package Assingnments;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Hello.what is your name");
		String name = input1.next();
		System.out.println(name);
		
		
		System.out.println("hello "+name +"and how old are you?");
		Scanner input2 = new Scanner(System.in);
		int age = input2.nextInt();
		
		System.out.println(age);
		
		System.out.println("So you're "+age+", eh? That's not old at all! \n"
				+ "How much do you make, "+name+"?");
		Scanner input3 = new Scanner(System.in);
		double wage = input3.nextDouble();
		System.out.println(wage + "! That's really good for your valli" +age+"!");
		
	
	}

}

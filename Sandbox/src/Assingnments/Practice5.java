package Assingnments;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		int age;
		String name;
		System.out.println("Hi there. What's your name?");
		Scanner input1 = new Scanner(System.in);
		 name = input1.next();
		 System.out.println(name);
		 System.out.println("Hi" +","+ "name!" +" My name is Java." + "Nice to meet you.");
		 System.out.println("how old are you?");
		 Scanner input2 = new Scanner(System.in);
		 age = input2.nextInt();
		 System.out.println(age);
		 System.out.println("Did you know that in five years you will be "+(age+5) +"years old?" +
				" And five years ago you were "+(age-5)+"! Imagine that!");
		 
		 
		

	}

}

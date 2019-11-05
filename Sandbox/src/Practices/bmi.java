package Practices;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("caliculate the bmi");
		//creating a scanner object to enter the input
		Scanner  input = new Scanner(System.in);
		
		double weight = input.nextDouble();
		double height = input.nextDouble();
		double bmi ;
		//Syste
		//int age;
		bmi = weight/(height*height);
		System.out.println(bmi);
		if(bmi<18.5)
		{
			System.out.println("under weight");
		}
		else if((bmi>=18.5) && (bmi<25))
		{
			System.out.println("normal");
		}
		else if((bmi>=25)&&(bmi<30))
		{
			System.out.println("overweight");
		}
		else if(bmi>=30)
		{
			System.out.println("obese");
		}
		else
		{
			System.out.println("nothing");
		}
			
			
		
		

	}

}

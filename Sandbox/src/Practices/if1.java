package Practices;

import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("enter the user input value");
		    int num;
		    Scanner input = new Scanner(System.in);
		    num = input.nextInt();
		    if(num >=0 )
		    {
		      System.out.println("it is positive");
		    }
		      else
		      {
		        System.out.println("it is negative");
		      }
	}
}

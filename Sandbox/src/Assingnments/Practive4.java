package Assingnments;

import java.util.Scanner;

public class Practive4 {

	public static void main(String[] args) {
		System.out.println("Please enter the following information so I can sell it for a profit!");
		String fname;
		String lname;
		int grade;
		int id;
		String login;
		double gpa;
		
		System.out.println("your information");
		System.out.println("what is your login");
		Scanner input1  = new Scanner(System.in);
		
		 login = input1.next();
		 System.out.println(login);
		 System.out.println("id");
		 
		 System.out.println("what is yourid");
		 Scanner input2 = new Scanner(System.in);
		 id = input2.nextInt();
		 System.out.println(id);
		 System.out.println("lname");
		 Scanner input3 = new Scanner(System.in);
		   lname = input3.next();
		   System.out.println(lname);
		   System.out.println("fname");
		   Scanner input4 = new Scanner(System.in);
		   fname = input4.next();
		   System.out.println(fname);
		   System.out.println("gpa");
		   Scanner input5 = new Scanner(System.in);
		   gpa = input5.nextDouble();
		   System.out.println(gpa);
		   System.out.println("grade");
		   Scanner input6 = new Scanner(System.in);
		   grade = input6.nextInt();
		   System.out.println(grade);
		   System.out.println("your information:");
		   System.out.println(login + " :login \n" 
				   			+ id + " :id \n"
				   			+ lname+", "+ fname +" :lname,fname \n"
				   			+ gpa + " :gpa \n"
				   			+ grade + " :grade");
		   
		   
		   
		 

	}

}

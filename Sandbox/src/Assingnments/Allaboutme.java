package Assingnments;

import java.util.Scanner;

public class Allaboutme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
			String myName;


			String myEyes;

			String myTeeth;
			String myHair;
			int myAge;

			int myHeight ;

			System.out.println("Enter the name");
			Scanner input1 = new Scanner(System.in);
			myName = input1.next();
			//System.out.println(myName );
			System.out.println("Enter the height");
			Scanner input2 = new Scanner(System.in);
			myHeight = input2.nextInt();
			// System.out.println(myHeight);
			System.out.println("Enter the age");
			Scanner input3 = new Scanner(System.in);
			myAge = input3.nextInt();
			// System.out.println(myAge);
//			System.out.println("Huh, that's older than I expected...");
			System.out.println("Enter the eyes color");
			Scanner input4 = new Scanner(System.in);
			myEyes = input4.next();
			//System.out.println(myEyes);
			System.out.println(" Enter hair color");
			Scanner input5 = new Scanner(System.in);
			myHair = input5.next();
			// System.out.println(myHair);
//			System.out.println("Their teeth are usually myTeeth, but it depends on the coffee.");
			System.out.println(" Enter teeth color");
			Scanner input6 = new Scanner(System.in);
			myTeeth = input6.next();
			// System.out.println(myTeeth);
//			System.out.println("Alright, this is pretty boring. Let's stop talking about myName");
			System.out.println("Let's talk about " + myName +"\n" + "They're " + myHeight + " inches tall." + "\n" + "They're " + myAge + " years old." +
			"\n" + "Huh, that's older than I expected..." + "\n" + "They have " + myEyes + " eyes and " + myHair +" hair." + "\n" + "Their teeth are usually  "
			+ myTeeth + "," + " but it depends on the coffee. " + "\n" + "Alright" +"," + " this is pretty boring." + " Let's stop talking about " + myName);
			}

			}
	



package Assingnments;

public class Allaboutme1 {

	public static void main(String[] args) {
		/*Create Strings named [myName], [myEyes], [myTeeth], and [myHair].
		Create integers named [myAge] and [myHeight].

		Use the following values for your variables
		[myName] = "Shahparan"
		[myAge] = 31
		[myHeight] = 175
		[myEyes] = "Black"
		[myTeeth] = "White"
		[myHair] = "Black"

		Print out the following lines:

		//Output
		Let's talk about [myName].
		They're [myHeight] inches tall.
		They're [myAge] years old.
		Huh, that's older than I expected...
		They have [myEyes] eyes and [myHair] hair.
		Their teeth are usually [myTeeth], but it depends on the coffee.
		Alright, this is pretty boring. Let's stop talking about [myName].

		WHAT YOU NEED TO DO
		1. Take the "my" out of the variable names! For instance, [myName] becomes [name].
		2. Remember to change those varible names EVERYWHERE. If the code doesn't work, make sure the variable names match up.
		3. Change the values to match your info. Your name might not be "Shahparan", so change it!
		4. Create a new variable that converts your height to centimeters. Make your program to the math!*/

      // String myName = "Shahparan";
       String myName= new String();
       myName = "Shahparan";
       String myEyes = "Black";
       String myHair = "Black";
       String myTeeth = "White";
       int myAge = 31;
       int myHeight = 170;
       System.out.println("Let's talk about " + myName + "\n");
       System.out.println("They're " + myHeight + " inches tall." + "\n");
       System.out.println("They're " + myAge + " years old." + "\n");
       System.out.println("Huh, " + "that's older than I expected..." + "\n");
       System.out.println("They have " + myEyes + " They have" + myHair + " hair." + "\n");
       System.out.println("Their teeth are usually " + myTeeth + "," + " but it depends on the coffee." + "\n");
       System.out.println("Alright, this is pretty boring. " + " Let's stop talking about " + myName + "." + "\n");
       String name = myName.replaceAll("Shahparan", "valli");
       
       System.out.println("Let's talk about " + name + "\n");
       System.out.println("They're " + myHeight + " inches tall." + "\n");
       System.out.println("They're " + myAge + " years old." + "\n");
       System.out.println("Huh, " + "that's older than I expected..." + "\n");
       System.out.println("They have " + myEyes + " They have" + myHair + " hair." + "\n");
       System.out.println("Their teeth are usually " + myTeeth + "," + " but it depends on the coffee." + "\n");
       System.out.println("Alright, this is pretty boring. " + " Let's stop talking about " + name + "." + "\n");
	}

}

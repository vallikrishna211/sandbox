package Practices;

import java.util.Scanner;

public class iexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a scanner object to collect input
  Scanner input = new Scanner(System.in);
  //generate a randondom number between 1 to 10
  int rand = (int)(Math.random()*10)+1;
  int rand2 = (int)(Math.random()*10)+1;
  //prompt the user to enter a value
    System.out.printf("what is %d + %d?",rand,rand2);
     int response = input.nextInt();
     //test the user responce to confirm if it is corrcet
     if(response == rand+rand2)
     {
    	 //print out a statement if the user answer is correct
    	 System.out.println("you are correct");
     }
     else
     {
    	 //print out a statement if the users answer is incorrect
    	 System.out.println("try again ;(");
     }
	}

}

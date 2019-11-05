package Practices;

import java.util.Scanner;

public class Areaofthecircle {

	public static void main(String[] args) {
	System.out.println("calculate area of the circle");
	  double radius;
	  double PI = Math.PI;
	  double areaofthecircle;
	  Scanner input = new Scanner(System.in);
	  radius = input.nextDouble();
	  areaofthecircle = PI*(radius*radius);
	  System.out.println("area of the circle is  "  + areaofthecircle );
	  
	  

	}

}

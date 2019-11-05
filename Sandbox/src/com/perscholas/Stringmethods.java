package com.perscholas;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "vallikrishna  ";
		
		System.out.println(s.charAt(4));
		System.out.println(s.length());
		System.out.println(s.concat("swathi"));
		System.out.println(s.contains("abs"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace("a", "e"));
		System.out.println(s.trim());
		System.out.println(s.replaceAll("valli", "abc"));
		System.out.println(s.equalsIgnoreCase("sams"));
		System.out.println(s.equals("swathi"));
		System.out.println(s.startsWith("valli"));
		System.out.println(s.substring(2));
		System.out.println(s.split("i", 5));
		System.out.println(s.substring(5, 9));
		System.out.println(s.replaceFirst("valli", "123"));
		System.out.println(s.matches("aparna"));
		System.out.println(s.indexOf(7));
		System.out.println(s.indexOf("kris"));
		

	}

}

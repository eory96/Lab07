package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;

public class YearToCentury_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner keyboard = new Scanner(System.in);
		YearToCentury ytc = new YearToCentury();
		
		System.out.println("Input year : ");
		year = keyboard.nextInt();
		System.out.println(year+" is "+ytc.getYr(year)+"th century.");
	}
	
	
}

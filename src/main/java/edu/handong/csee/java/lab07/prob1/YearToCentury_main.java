package edu.handong.csee.java.lab07.prob1;//package name

import java.util.Scanner;//use for Scanner
/**
 * This package calculate century when input a year
 * @author samsung
 *
 */
public class YearToCentury_main {//YearToCentury_main public class
/**
 * main method of YearToCentury it is print information
 * @param args
 */
	public static void main(String[] args) {//main method for YearToCentury
		// TODO Auto-generated method stub
		int year;//variable for input the year data
		Scanner keyboard = new Scanner(System.in);//this command make receive input from keyboard
		YearToCentury ytc = new YearToCentury();//instanciation of YearToCentury
		
		System.out.println("Input year : ");//printout "Input year : "
		year = keyboard.nextInt();//initialization of year
		System.out.println(year+" is "+ytc.getYr(year)+"th century.");//printout input year and century of year
	}
	
	
}

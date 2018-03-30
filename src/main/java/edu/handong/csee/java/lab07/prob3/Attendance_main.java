package edu.handong.csee.java.lab07.prob3;//package name edu.handong.csee.java.lab07.prob3

import java.util.Random;//make it available using random number
/**
 * This class make random absence number consequently print about fail or pass 
 * @author samsung
 *
 */
public class Attendance_main {//class name is Attendance_main
/**
 * This method is main method print about information of student
 * @param args
 */
	public static void main(String[] args) {//Declare main method
		Random randomGen = new Random();//instantiation of Random class to randomGen
		
		Attendance student1 = new Attendance("Jess",4,21400999,randomGen.nextInt(10));//Instantiation of Attendance class to student1 and send name, grade, student number, number of absent
		Attendance student2 = new Attendance("Kent",2,21700111,randomGen.nextInt(10));//Instantiation of Attendance class to student2 and send name, grade, student number, number of absent
		Attendance student3 = new Attendance("Lucas",1,21833222,randomGen.nextInt(10));//Instantiation of Attendance class to student3 and send name, grade, student number, number of absent
		Attendance student4 = new Attendance("Martha",2,21733444,randomGen.nextInt(10));//Instantiation of Attendance class to student4 and send name, grade, student number, number of absent
		//randomGen.nextInt(10) mean that parameter can receive padding 1to10
		if(student1.getAbsence()>6) {//use conditional statement it means absence number of student1 is lager than 6 compile under the {}sector
			System.out.println("I'm sorry, "+student1.getName()+". You failed this course");//printout fail message
			System.out.println(student1.getName() + "-Number of absence : " + student1.getAbsence());//printout number of absence
			}
		else//if absence number of student1 is not larger than 6 compile under {}sector
			System.out.println("We'll see about the grade, " + student1.getName());//printout student1 information
		
		if(student2.getAbsence()>6) {//use conditional statement it means absence number of student2 is lager than 6 compile under the {}sector
			System.out.println("I'm sorry, "+student2.getName()+". You failed this course");//printout fail message
			System.out.println(student2.getName() + "-Number of absence : " + student2.getAbsence());//printout number of absence
			}
		else//if absence number of student2 is not larger than 6 compile under {}sector
			System.out.println("We'll see about the grade, " + student2.getName());//printout student2 information
		
		if(student3.getAbsence()>6) {//use conditional statement it means absence number of student3 is lager than 6 compile under the {}sector
			System.out.println("I'm sorry, "+student3.getName()+". You failed this course");//printout fail message
			System.out.println(student3.getName() + "-Number of absence : " + student3.getAbsence());//printout number of absence
			}
		else//if absence number of student3 is not larger than 6 compile under {}sector
			System.out.println("We'll see about the grade, " + student3.getName());//printout student3 information
		
		if(student4.getAbsence()>6) {//use conditional statement it means absence number of student4 is lager than 6 compile under the {}sector
			System.out.println("I'm sorry, "+student4.getName()+". You failed this course");//printout fail message
			System.out.println(student4.getName() + "-Number of absence : " + student4.getAbsence());//printout number of absence
			}
		else//if absence number of student4 is not larger than 6 compile under {}sector
			System.out.println("We'll see about the grade, " + student4.getName());//printout student3 information
		
		
	}

}

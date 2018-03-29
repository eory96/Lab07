package edu.handong.csee.java.lab07.prob3;

import java.util.Random;

public class Attendance_main {

	public static void main(String[] args) {
		String iname;
		int igrade;
		int inumber;
		int iabsence;
		
		Random randomGen = new Random();
		
		Attendance student1 = new Attendance("Jess",4,21400999,randomGen.nextInt(10));
		Attendance student2 = new Attendance("Kent",2,21700111,randomGen.nextInt(10));
		Attendance student3 = new Attendance("Lucas",1,21833222,randomGen.nextInt(10));
		Attendance student4 = new Attendance("Martha",2,21733444,randomGen.nextInt(10));
		
		if(student1.getAbsence()>6) {
			System.out.println("I'm sorry, "+student1.getName()+". You failed this course");
			System.out.println(student1.getName() + "-Number of absence : " + student1.getAbsence());
			}
		else
			System.out.println("We'll see about the grade, " + student1.getName());
		
		if(student2.getAbsence()>6) {
			System.out.println("I'm sorry, "+student2.getName()+". You failed this course");
			System.out.println(student2.getName() + "-Number of absence : " + student2.getAbsence());
			}
		else
			System.out.println("We'll see about the grade, " + student2.getName());
		
		if(student3.getAbsence()>6) {
			System.out.println("I'm sorry, "+student3.getName()+". You failed this course");
			System.out.println(student3.getName() + "-Number of absence : " + student3.getAbsence());
			}
		else
			System.out.println("We'll see about the grade, " + student3.getName());
		
		if(student4.getAbsence()>6) {
			System.out.println("I'm sorry, "+student4.getName()+". You failed this course");
			System.out.println(student4.getName() + "-Number of absence : " + student4.getAbsence());
			}
		else
			System.out.println("We'll see about the grade, " + student4.getName());
		
		
	}

}

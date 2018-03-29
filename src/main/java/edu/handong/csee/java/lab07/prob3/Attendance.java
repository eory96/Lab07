package edu.handong.csee.java.lab07.prob3;

//import java.util.Random;

public class Attendance {
	private String name;
	private int grade;
	private int number;
	private int absence;
	
	public Attendance(String iname,int igrade, int inumber, int iabsence){
		this.name = iname;
		this.grade = igrade;
		this.number = inumber;
		this.absence = iabsence;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAbsence() {
		return absence;
	}
	public void setAbsence(int absence) {
		this.absence = absence;
	}
}

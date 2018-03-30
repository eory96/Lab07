package edu.handong.csee.java.lab07.prob3;//package name is edu.handong.csee.java.lab07.prob3
/**
 * This class is for setter and getter(constructor)
 * @author samsung
 *
 */
public class Attendance {//Class name is Attendance
	private String name;//Declare private variable  
	private int grade;//Declare private variable
	private int number;//Declare private variable
	private int absence;//Declare private variable -> i dont't want to other person access 
	/**
	 * This method get information about name, grade, student number, number of absence
	 * @param iname
	 * @param igrade
	 * @param inumber
	 * @param iabsence
	 */
	public Attendance(String iname,int igrade, int inumber, int iabsence){//Method name is Attendance
		this.name = iname;// variable of current class is initialized iname by method
		this.grade = igrade;// variable of current class is initialized igrade by method
		this.number = inumber;// variable of current class is initialized inumber by method
		this.absence = iabsence;// variable of current class is initialized iabsence by method
	}
	
	/**
	 * getter for Name
	 * @return
	 */
	public String getName() {//method name is getName and return value is string
		return name;//name is returned when this method called by other
	}
	
	/**
	 * setter for name
	 * @param name
	 */
	public void setName(String name) {//this method name setName and receive string value
		this.name = name;//this class name initialization to other class name
	}
	
	/**
	 * getter for grade
	 * @return
	 */
	public int getGrade() {//method name is getGrande and return value is int
		return grade;//grade is returned when this method called by other
	}
	
	/**
	 * setter for grade
	 * @param grade
	 */
	public void setGrade(int grade) {//this method name setGrade and receive int value
		this.grade = grade;//this class grade initialization to other class grade
	}
	
	/**
	 * getter for number
	 * @return
	 */
	public int getNumber() {//method name is getNumber and return value is int
		return number;//number is returned when this method called by other
	}
	
	/**
	 * setter for number
	 * @param number
	 */
	public void setNumber(int number) {//this method name setNumber and receive int value
		this.number = number;//this class number initialization to other class number
	}
	
	/**
	 * getter for absence
	 * @return
	 */
	public int getAbsence() {//method name is getAbsence and return value is int
		return absence;//absence is returned when this method called by other
	}
	
	/**
	 * setter for absence
	 * @param absence
	 */
	public void setAbsence(int absence) {//this method name setAbsence and receive int value
		this.absence = absence;//this class absence initialization to other class absence
	}
}

package edu.handong.csee.java.lab07.prob1;//package name
/**
 * this class declare getter and setter of variable
 * @author samsung
 *
 */
public class YearToCentury {
	int cen;//it is variable for calculating century
/**
 * this method is getter for using in main class
 * @param year
 * @return
 */
	public int getYr(int year) {//getYr receive parameter from main class
		if(year % 100 == 0) {//if year remainder is 0 implement under command in{}
			cen = year/100;//initialization cen as year/100
			return cen;//return value is cen (type is int)
		}
		else {//if year remainder is not 0 implement under command in{}
			cen = year/100+1;//initialization cen as year/100+1
			return cen;//return value is cen (type is int)
		}
	}
/**
 * this method is setter using for receive icen
 * @param cen
 */
	public void setYr(int icen) {//setYr receive parameter icen
		this.cen = icen;////initialization cen as icen
	}

}

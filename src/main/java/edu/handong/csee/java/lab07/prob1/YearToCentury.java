package edu.handong.csee.java.lab07.prob1;

public class YearToCentury {
	int cen;

	public int getYr(int year) {
		if(year % 100 == 0) {
			cen = year/100;
			return cen;
		}
		else {
			cen = year/100+1;
			return cen;
		}
	}

	public void setYr(int cen) {
		this.cen = cen;
	}

}

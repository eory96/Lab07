package edu.handong.csee.java.lab07.prob2;
/**
 * this class receive name, price, star from the main class
 * @author samsung
 *
 */
public class Chicken {//public class for Chicken

	private String name;//declare name and can't touch another
	private double price;//declare name price can't touch another
	private int star;//declare star and can't touch another
	
	/**
	 * this method for a get information from main class
	 * @param namem
	 * @param pricem
	 * @param starm
	 */
	public void Chicken(String namem, double pricem, int starm) {//public method name is Chicken and parameter is namem,pricem,starm
		this.name = namem;//this class name initialization to namem
		this.price = pricem;//this class price initialization to pricem
		this.star = starm;//this class star initialization to starm
		
	}
	/**
	 * getter for getName
	 * @return
	 */
	public String getName() {//this method return value is String 
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
	 * getter for price
	 * @return
	 */
	public double getPrice() {//this method return value is double
		return price;//price is returned when this method called by other
	}
	/**
	 * setter for name
	 * @param name
	 */
	public void setPrice(double price) {//this method name setPrice and receive double value
		this.price = price;//this class price initialization to other class price
	}
	/**
	 * getter for star
	 * @return
	 */
	public int getStar() {//this method return value is int
		return star;//star is returned when this method called by other
	}
	/**
	 * setter for name
	 * @param name
	 */
	public void setStar(int star) {//this method name setStar and receive int value
		this.star = star;//this class star initialization to other class star
	}
}

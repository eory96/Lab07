package edu.handong.csee.java.lab07.prob2;

public class Chicken {

	private String name;
	private double price;
	private int star;
	
	
	public void Chicken(String namem, double pricem, int starm) {
		this.name = namem;
		this.price = pricem;
		this.star = starm;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
}

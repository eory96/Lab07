package edu.handong.csee.java.lab07.prob2;
/**
 * this is menu for chicken store and print rating of each menu
 * @author samsung
 *
 */
public class Chicken_main {//Chicken_main public class

	public static void main(String[] args) {//this method is main method for printout menu
		
		Chicken menu1 = new Chicken();//instantiation Chicken to menu1
		Chicken menu2 = new Chicken();//instantiation Chicken to menn2
		Chicken menu3 = new Chicken();//instantiation Chicken to menu3
		
		menu1.Chicken("Cheese_mustard", 25000.0, 4);//instance of menu1 call method from Chicken class
		menu2.Chicken("Honey_mustard", 25000.0, 4);//instance of menu2 call method from Chicken class
		menu3.Chicken("Spicy_mustard", 25000.0, 4);//instance of menu3 call method from Chicken class
		
		menu1.setStar(3);//instance of menu1 call method from Chicken class and send 3
		menu2.setStar(4);//instance of menu1 call method from Chicken class and send 4
		menu3.setStar(1);//instance of menu1 call method from Chicken class and send 1
		
		System.out.println(menu1.getName()+"'s rating is "+menu1.getStar());//printout about menu1 - menu name, rating
		System.out.println(menu2.getName()+"'s rating is "+menu2.getStar());//printout about menu2 - menu name, rating
		System.out.println(menu3.getName()+"'s rating is "+menu3.getStar());//printout about menu3 - menu name, rating

	}

}

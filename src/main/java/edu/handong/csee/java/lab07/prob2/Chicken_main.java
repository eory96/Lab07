package edu.handong.csee.java.lab07.prob2;
/**
 * this is menu for chicken store
 * @author samsung
 *
 */
public class Chicken_main {

	public static void main(String[] args) {
		//String namem;
		//int pricem;
		//int starm;
		
		Chicken menu1 = new Chicken();
		Chicken menu2 = new Chicken();
		Chicken menu3 = new Chicken();
		
		menu1.Chicken("Cheese_mustard", 25000.0, 4);
		menu2.Chicken("Honey_mustard", 25000.0, 4);
		menu3.Chicken("Spicy_mustard", 25000.0, 4);
		
		menu1.setStar(3);
		menu2.setStar(4);
		menu3.setStar(1);
		
		System.out.println(menu1.getName()+"'s rating is "+menu1.getStar());
		System.out.println(menu2.getName()+"'s rating is "+menu2.getStar());
		System.out.println(menu3.getName()+"'s rating is "+menu3.getStar());

	}

}

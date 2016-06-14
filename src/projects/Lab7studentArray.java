package projects;

import java.util.Scanner;

public class Lab7studentArray {
	Scanner scan = new Scanner(System.in);

	/*
	 * public void setObjects(String food, String homeTown) {
	 * System.out.println(); }
	 * 
	 * public void askObjects() { System.out.println("Please enter your Name: "
	 * ); String name = scan.nextLine(); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] studentArray = { "Hussein", "Ethan", "Eric", "Johnathan", "Tyler", "Robert", "Ashish", "Jacob",
				"Logan", "Alex", "Paul", "Rahul", "Conor", "Steve", "Brandon", "Ralphi", "Patrick", "Jonpaul",
				"Kathleen", "Melanie", "Angela", "Kaitlin", "Ashura", "Candelaria", "Chelsea" };

		
		String foodArray[] = {"hamberger", "eggs", "eggs", "juice", "Tapas", "raddishs", "apples","juice",
				"licorice", "apples", "pasta", "raisins", "coconut", "syrup", "brocoli", "relish", "pineapple", "juice",
				"kelp", "mashed potatoes", "asperagus", "kelp", "apple pie", "cheese", "cheese"};
		String homeTown[] = {"Hartford", "ethiopia","exiter", "jupiter", "toledo","richmond", "agusta", "johnstown",
				"lexington", "arizona", "palo alto", "richardsville", "canada", "syria", "boston", 
		}

		// want to do a input validation.

		// Do I want each name to be an object? with two fields?
		// Is each name going to be a field of the object Lab7studentArray?

		// figure out how to make each of them objects with fields for hometown
		// and
		// favorite food
		// use a loop to give them the terms
		// create a method for entering the information by searching for the
		// name
		// and then prompting
		// for the information.

		
		System.out.println("length of studentArray: " + studentArray.length);

	}

}

package projects;

import java.util.Scanner;

public class Lab7studentArray {
	static Scanner scan = new Scanner(System.in);

	/*
	 * public void setObjects(String food, String homeTown) {
	 * System.out.println(); }
	 * 
	 * public void askObjects() { System.out.println("Please enter your Name: "
	 * ); String name = scan.nextLine(); }
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		int number = 1;

		String[] studentArray = { "Hussein", "Ethan", "Eric", "Johnathan", "Tyler", "Robert", "Ashish", "Jacob",
				"Logan", "Alex", "Paul", "Rahul", "Conor", "Steve", "Brandon", "Ralphi", "Patrick", "Jonpaul",
				"Kathleen", "Melanie", "Angela", "Kaitlin", "Ashura", "Candelaria", "Chelsea" };

		String foodArray[] = { "hamberger", "eggs", "eggs", "juice", "Tapas", "raddishs", "apples", "juice", "licorice",
				"apples", "pasta", "raisins", "coconut", "syrup", "brocoli", "relish", "pineapple", "juice", "kelp",
				"mashed potatoes", "asperagus", "kelp", "apple pie", "cheese", "cheese" };
		String homeTown[] = { "Hartford", "ethiopia", "exiter", "jupiter", "toledo", "richmond", "agusta", "johnstown",
				"lexington", "arizona", "palo alto", "richardsville", "canada", "syria", "boston", "ramsey", "pinetop",
				"jeanuo", "kentucky", "memphis", "Adrien", "kansas", "aberdeen", "california", "cheyne" };

		System.out.println("Welcome to our Java class.  Which student would you liek to learn more about?");
		boolean repeat = true;
		while (repeat) {
			boolean goodNumber = true;
			while (goodNumber) {
				number = 0;
				System.out.println("Please enter a number between 1 and 25");
				try {
					number = scan.nextInt();
				} catch (Exception e) {
					System.out.println("Invalid Answer, Please Try Again.");
					continue;
				}
				if (number < 1 || number > 25) {
					System.out.println("The number must be between 1 and 25. Please Try Again.");
					continue;
				} else {
					break;
				}
			}
			System.out.println("Student " + number + " is " + studentArray[number - 1]);
			boolean choiceGood = true;
			String choice = "";
			while (choiceGood) {
				System.out.println("Would you like to know about " + studentArray[number - 1] + "'s hometown or "
						+ studentArray[number - 1] + "'s favorite food?");
				choice = scan.nextLine();
				/*
				 * try { } catch (NumberFormatException e) { System.out.println(
				 * "Invalid Answer, Please Try Again."); continue; }
				 */
			}
			if (choice.toLowerCase().contains("food")) {
				System.out.println(studentArray[number - 1] + "'s favorite food is " + foodArray[number - 1] + ".");
				break;
			} else if (choice.toLowerCase().contains("hometown")) {
				System.out.println(studentArray[number - 1] + " is from " + homeTown[number - 1] + ".");
				break;
			} else {
				System.out.println("Your answer did not compute, please try again.");
			}
		} // while

		System.out.println("Would you like to know more about other students?");
		boolean yOrN = true;
		String answerRepeat = "";
		while (yOrN) {
			System.out.println("Please enter Y or N");
			try {
				answerRepeat = scan.nextLine();
			} catch (NumberFormatException e) {
				System.out.println("Invalid Answer, Please Try Again.");
				continue;
			}
			if (answerRepeat.toLowerCase().contains("y"))
				repeat = true;
			else if (answerRepeat.toLowerCase().contains("n"))
				continue;
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

	}

}

//Jonpaul Barrabee
//6/14/2016
//Project 7 Java Bootcamp

package projects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7studentArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// TODO Auto-generated method stub
		int number = 1;

		String[] studentArray = { "Hussein", "Ethan", "Eric", "Johnathan", "Tyler", "Robert", "Ashish", "Jacob",
				"Logan", "Alex", "Paul", "Rahul", "Conor", "Steve", "Brandon", "Ralphi", "Patrick", "Jonpaul",
				"Kathleen", "Melanie", "Angela", "Kaitlin", "Ashura", "Candelaria", "Chelsea" };
		// I put in random foods that started with the same name as the student
		String foodArray[] = { "hamberger", "eggs", "eggs", "jello", "Tapas", "raddishs", "apples", "juice", "licorice",
				"apples", "pasta", "raisins", "coconut", "syrup", "brocoli", "relish", "pineapple", "jolly ranchers",
				"kiwi", "mashed potatoes", "asperagus", "", "apple pie", "cheese", "canned tuna" };
		String homeTown[] = { "Hartford", "ethiopia", "exiter", "jupiter", "toledo", "richmond", "agusta", "johnstown",
				"lexington", "arizona", "palo alto", "richardsville", "canada", "syria", "boston", "ramsey", "pinetop",
				"jeanuo", "kentucky", "memphis", "Adrien", "kansas", "aberdeen", "california", "cheyne" };

		System.out.println("Welcome to our Java class.  Which student would you liek to learn more about?");
		boolean repeat = true; // I could just put true in the while loop but I
								// need
		while (repeat) { // to know which brackets line up with which
			boolean goodNumber = true;
			while (goodNumber) {
				number = 0;
				System.out.println("Please enter a number between 1 and 25");
				try {
					number = scan.nextInt(); // the try is simply to see if the
												// answer can be entered as an
												// int
				} catch (InputMismatchException e) {
					System.out.println("That's not a number!\n");
					scan.nextLine(); // I did not know why I was having a
					// problem so I googled "problems with try and loops" Turns
					// out that there is that Int junk problem
					// scan.nextLine solves the problem.
					continue; // Continue jumps to the top of the loop
				}
				if (number < 1 || number > 25) {
					System.out.println("The number must be between 1 and 25. Please Try Again.");
					continue; // Jumps to the top of the loop
				} else {
					break; // jumps out of the loop
				} // I never have to deal with goodNumber being true or false
					// because my commands are to jump
			}
			System.out.println("Student " + number + " is " + studentArray[number - 1]);
			boolean choiceGood = true;
			scan.nextLine(); // if I did not add this it would do the next while
								// loop twice because of the garbage
			while (choiceGood) {
				System.out.println("Would you like to know about " + studentArray[number - 1] + "'s hometown or "
						+ studentArray[number - 1] + "'s favorite food?"); // we
																			// talked
																			// about
																			// -1
																			// because
																			// arrays
																			// start
																			// with
																			// 0
				String choice = scan.nextLine();

				// no concern of mis match input here because they are strings
				if (choice.toLowerCase().contains("food") || choice.toLowerCase().contains("favorite")) {
					System.out
							.println(studentArray[number - 1] + "'s favorite food is " + foodArray[number - 1] + ".\r");
					break;
				} else if (choice.toLowerCase().contains("hometown")) {
					System.out.println(studentArray[number - 1] + " is from " + homeTown[number - 1] + ".\r");
					break;
				} else {
					System.out.println("Your answer did not compute, please try again.");
				}
			} // while good choice Here I mark what the closing bracket belongs
				// to

			System.out.println("Would you like to know more about other students?");
			boolean yOrN = true;
			String answerRepeat = ""; // need to initialize the variable
			while (yOrN) {
				System.out.println("Please enter Y or N");
				try {
					answerRepeat = scan.nextLine();
				} catch (NumberFormatException e) {
					System.err.println("Invalid Answer, Please Try Again.");
					continue;
				}
				if (answerRepeat.toLowerCase().contains("y")) {
					repeat = true;
					break;
				} else if (answerRepeat.toLowerCase().contains("n")) {
					System.out.println("Have a good day");
					repeat = false;
					break;
				}

				scan.close(); // - - create at same time.
			}

		}
	}
}

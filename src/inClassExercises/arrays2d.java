package inClassExercises;

import java.util.Arrays;

public class arrays2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] minefield = new char[10][12]; // row is first, column is second
		// Arrays.fill(minefield,' ' ); why not work become method, even though
		// a bad method
		for (int r = 0; r < minefield.length; r++) { // go through rows
			Arrays.fill(minefield[r], '.');
		}

		for (int i = 0; i < 10; i++) {
			// need random numbers
			int r = (int) (Math.random() * 10);
			int c = (int) (Math.random() * 12);

			minefield[r][c] = '*'; // "" are for strings '' are for characters.
		}
		for (int r = 0; r < minefield.length; r++) { // go through rows
			for (int c = 0; c < minefield[r].length; c++) {
				System.out.print(minefield[r][c]);
			}
			System.out.println(); //
			// System.out.println(minefield[r]); // windows puts a box with
			// // a
			// null // entry

		}
	}
}

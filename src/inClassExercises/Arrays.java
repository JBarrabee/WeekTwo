package inClassExercises;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating object dataType varName = new dataType
		int scoreArray[] = { 2, 11, 6, 8, 9 };
		int max = scoreArray[0];
		for (int i = 0; i < scoreArray.length - 1; i++) {
			if (scoreArray[i] < scoreArray[i + 1]) {
				max = scoreArray[i + 1];
			}
		}
		System.out.println("max = " + max);
	}

}

package inClassExercises;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		// declare an arrayList
		// data type name = new datatype (info);
		// syntax for generics
		// collectionType <dataType> name = new collectionType (size);
		ArrayList<String> names = new ArrayList();
		names.add("ahul");
		names.add("Baphael");
		names.add("Cennis");
		names.add("Dennis");

		System.out.println(names.size() + "after");

		names.add(3, "Steven"); // add means push down
		names.set(3, "Stephen"); // changes number three
		names.remove(2); // removes something
		String deleated = names.remove(3); // shows what was removed at three.
		names.remove("Dennis"); // remove based on content
		names.add("Alex");
		names.add("Alex");
		names.add("Alex");
		names.add("Alex");
		names.add("Alex");

		names.remove("Alex"); // removes only first occurance

		// multi remove
		while (names.contains("Alex")) {
			names.remove("Alex");
		}
//		for (String name : names) {
//			System.out.println(name);
		}
	}
}

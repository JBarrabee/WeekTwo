package oopProject;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Student person1 = new Student("Bonnerjee, Rahul", 1, "Java");
		
		Student person2 = new Student("Gebre-Egziabher, Raphael",2, "java");
		
		// changing it later
		person1.setBootcamp("Java June 2016");
		
		//can make array of students
		 Student [ ] students = {new Student (" Smith, Joe", 3, "java fulltime" ),
				new Student ("Smith, james", 4, "Front Partime")
//		}
//		ArrayList< Student> studentList = new ArrayList < Student>();
//		 student.list((" Smith, Joe", 3, "java fulltime" ),
//					new Student ("Smith, james", 4, "Front Partime");
			}
		
		
		
		
	}

}

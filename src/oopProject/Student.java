package oopProject;

public class Student {
	// Want Name
	private String name;
	private int id;
	private String bootcamp;

	public Student(String n, int i, String b) {
		name = n;
		id = i;
		bootcamp = b;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getBootcamp() {
		return bootcamp;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBootcamp(String bootcamp) {
		this.bootcamp = bootcamp;
	}

	public String toString (){
		return name +"\t" + id + '\\t'+ bootcamp;
	}
}

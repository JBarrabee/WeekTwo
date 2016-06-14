package oopProject;

public class Rectangle {

	// fields needed, visibility modifiers (public, private,
	// in class outside methods, potentially different
	// General rule, data is private, methods are public
	private double length;
	private double width;
	// class variables (static) same for all instances

	// actions tasks the object
	// methods
	// private:can only be used in the class
	// protected: can be used within the package
	// public can be used anywhere.
	// instance methods (can use instance variables from the particular
	// rectangle

	// constructor is a method like thing. The method called by "new" keyword
	// must be public
	// no return type (not void)
	// for the instance cannot be static
	// name: is the class name
	// Arguments :default has no arguments

	public Rectangle() {
		length = 1;
		width = 1;
	}

	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	public double calcArea() {
		return length * width;
	}

	public double calcParimeter() {
		return (2 * (length + width));
	}

	// now create getters//accessers and setters
	// getters give you public acces to private data
	// no particular type of name.
	// almost always public
	// usually returns dataType of the private variable
	// name is get + instance variable
	// often argument is empty

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	// setter/Mutator
	// mutators let you change private data outside the class
	// almost always public
	// never static - deal with instance data
	// usually return void (sometimes boolean)
	// name is usually set + instance variable
	// arguement is usually the dataType of the instance variable

	public void setLength(double l) {
		length = l;
	}

	// alternate style
	public void setWidth(double width) { // shadow variable, local varible
		this.width = width; // has same name as an instance variable
	}

	// helper methods, do some secondary task
	// private, only within this class

}

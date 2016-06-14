package oopProject;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// datatype name = new datatype (info)
		Rectangle def = new Rectangle(); // calls the constructor
		Rectangle table = new Rectangle(30, 60); // calls the constructor
		Rectangle window = new Rectangle(23, 40); // calls the constructor

		System.out.println("Window");
		System.out.println("area : " + window.calcArea());
		System.out.println("Perimiter: " + window.calcArea());

		System.out.println("table");
		System.out.println("area : " + table.calcArea());
		System.out.println("Perimiter: " + table.calcArea());

		System.out.println("def");
		System.out.println("area : " + def.calcArea());
		System.out.println("Perimiter: " + def.calcArea());

		window.setLength(2);
		window.setWidth(3);
		System.out.println("Window");
		System.out.println(window.getLength() + " x" + window.getWidth());
		System.out.println("area : " + window.calcArea());
		System.out.println("Perimiter: " + window.calcParimeter());
	}

}

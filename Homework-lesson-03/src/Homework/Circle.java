package Homework;

public class Circle {
	
	private double radius;
	private double diametr;

	public Circle() {
		radius = 10.0;
		diametr = radius * 2;
	}
	public Circle(double radius) {
		this.radius = radius;
		diametr = radius * 2;
	}

	public void getSquare() {
		System.out.println("Площа кола = " + (Math.PI * diametr * diametr) / 4);
	}
	public void getLenght() {
		System.out.println("Довжина кола = " + 2 * Math.PI * radius);
	}

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(10.0);
		
		circle1.getSquare();
		circle1.getLenght();
		
		circle2.getSquare();
		circle2.getLenght();
	}
	}


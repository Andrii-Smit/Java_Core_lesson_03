package Homework;

public class Rectangle {
	
	private int width;
	private int length;

	public Rectangle() {
		this.width = 10;
		this.length = 20;
	}

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public void getSquare() {
		System.out.println("Площа прямокутника = " + width * length);
	}

	public void getPerimetr() {
		System.out.println("Периметр прямокутника = " + (width + length) * 2);
	}

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(30, 40);
		
		rectangle1.getPerimetr();
		rectangle1.getSquare();
		
		rectangle2.getPerimetr();
		rectangle2.getSquare();
	}

	}

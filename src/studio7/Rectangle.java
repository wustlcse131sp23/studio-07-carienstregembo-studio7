package studio7;

public class Rectangle {

	private double length; 
	private double width; 
	
	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return this.getLength();
	}
	
	public double getWidth() {
		return this.getWidth();
	}
	
	public double area() {
		return this.length * this.width;
	}
	
	public double perimeter() {
		return this.length * 2 + this.width * 2;
	}
	
	public boolean checkArea(Rectangle two) {
			return this.area() < two.area();
		}
	
	public boolean checkSquare() { 
		return this.length == this.width;
	}
			
	public String toString() {
		return "length: " + this.getLength() + ", width: " + this.getWidth();
	}
	
	public static void main(String[] args) {
		Rectangle one = new Rectangle (6.3, 4.5);
		Rectangle two = new Rectangle (1.7, 7.9);
		
		System.out.println("Area: " + one.area());
		System.out.println("Perimeter: " + one.perimeter());
		System.out.println(one.checkArea(two));
		System.out.println("Is it a square: " + one.checkSquare());
		
		
		
	}
}
	
	
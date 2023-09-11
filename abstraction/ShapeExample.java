//Create an abstract class called Shape with an abstract method calculateArea(). Create subclasses Circle, Rectangle, and Triangle that inherit from Shape and implement the calculateArea() method to calculate the area of each shape.

package abstraction;

abstract class Shape{
	abstract void calculateArea();
}

class Circle extends Shape{

	@Override
	void calculateArea() {
		int r = 5;
		final double pi = 3.14;
		
		double area = pi*(r*r);
		System.out.println("Area of circle: "+area);
		
	}
	
}

class Rectangle extends Shape{
	void calculateArea() {
		int l = 5;
		int b = 10;
		
		int area = l*b;
		System.out.println("Area of Rectangle: "+area);
	}
}
class Triangle extends Shape{
	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		int l = 5;
		int b = 10;
		double area = (l*b)/2;
		System.out.println("Area of triangle: "+area);
	}
}


public class ShapeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tr = new Triangle();
		tr.calculateArea();
		
		Rectangle re = new Rectangle();
		re.calculateArea();
		
		Circle cr = new Circle();
		cr.calculateArea();

	}

}



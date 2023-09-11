package polymorphisam;

public class Polymorphisam1 {

	public void area() {
		int side, area;
		side = 2;
		area = side * side;
		System.out.println("Area of Square = "+area);
	}
	
	public void area(int r) {
		double area = 3.14 * r * r;
		System.out.println("Area of circle = "+area);
	}
	public static void main(String[] args) {
		Polymorphisam1 p1 = new Polymorphisam1();
		p1.area();
		p1.area(5);
	}
}

package polymorphisam;

public class Polymorphisam2 {

	public void m1() {
		System.out.println("Method with no parameter");
	}
	
	public void m1(short a) {
		System.out.println("Method with short parameter");
	}
	
	public void m1(int a) {
		System.out.println("Method with int parameter");
	}
	
	public void m1(float a) {
		System.out.println("Method with float parameter");
	}
	
	public void m1(double a) {
		System.out.println("Method with double parameter");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphisam2 p2 = new Polymorphisam2();
		p2.m1(5.5);

	}

}

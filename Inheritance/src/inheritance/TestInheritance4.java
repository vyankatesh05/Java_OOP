//NOTE= if we make m1 of Inheritance class final then it will show error

package inheritance;

class Inheritance {
	public void m1() {
		System.out.println("M1 of Inheritance class");
	}
	
	public void m2() {
		System.out.println("M2 of Inheritance class");
	}
}

public class TestInheritance4 extends Inheritance{
	
	public void m1() {
		System.out.println("M1 of TestInhertance4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Inheritance i = new Inheritance();
//		i.m1();
		TestInheritance4 t4 = new TestInheritance4();
		t4.m1();
		t4.m2();

	}

}

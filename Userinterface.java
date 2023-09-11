package interface01;

public class Userinterface implements Interface1{
	public void m1() {
		System.out.println(a);
		System.out.println("defining interface method-1");
	}
	
	public void m2() {
		System.out.println("defining interface method-2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Userinterface u1 = new Userinterface();
		u1.m1();
		u1.m2();

	}

}

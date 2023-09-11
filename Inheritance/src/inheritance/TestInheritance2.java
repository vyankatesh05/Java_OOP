package inheritance;
class GrandParent{
	public void m1() {
		System.out.println("GrandParent method");
	}
}

class Parents extends GrandParent{
	public void m2() {
		System.out.println("Parent method");
	}
}

class GrandChild extends Parents{
	public void m3() {
		System.out.println("GrandChild method");
	}
}

public class TestInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild obj = new GrandChild();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}

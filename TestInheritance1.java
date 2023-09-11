//Single level inheritance
package inheritance;

class Parent{
	public void m1() {
		System.out.println("parent class");
	}
}

class Child extends Parent{
	public void m2() {
		System.out.println("Child");
	}
}

public class TestInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj1 = new Child();
		obj1.m1();
		obj1.m2();
		
		System.out.println("------------");
		Parent obj2 = new Parent();
		obj2.m1();
		//obj2.m2();

	}

}

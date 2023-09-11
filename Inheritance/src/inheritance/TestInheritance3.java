package inheritance;

class Parent1{
	public void m1() {
		System.out.println("Parent class");
	}
}

class Child1 extends Parent1{
	public void m1() {
		
	}
}

class Child2 extends Parent1{
	public void m1(){
		
	}
}

public class TestInheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1 = new Child1();
		c1.m1();
		
		Child2 c2 = new Child2();
		c2.m1();
	}

}

package polymorphisam;

 class Polymorphisam3 {
	
	public void m1() {
		System.out.println("m1 of base/ parent class");
	}
}
  class Pol2 extends Polymorphisam3 {
	  public void m1() {
		  System.out.println("m1 of derived/ child class");
	  }
	  
	  public static void main(String[] args) {
		Pol2 p2 = new Pol2();
		p2.m1();
	}
 }
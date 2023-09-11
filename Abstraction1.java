package abstraction;
//
//abstract class Vehicle {
//	abstract float getSpeed();
//	abstract String getColor(); 
//}
//
//class Car extends Vehicle{
//	public float getSpeed() {
//		return 80.5f;
//	}
//	
//	public String getColor() {
//		return "Black";
//	}
//}
//
//class Bike extends Vehicle{
//
//	@Override
//	float getSpeed() {
//		
//		return 40.5f;
//	}
//
//	@Override
//	String getColor() {
//		
//		return "blue";
//	}
//	
//}
//
//public class Abstraction1 {
//	public static void main(String[] args) {
//	
//	Bike b = new Bike();
//	System.out.println("Speed of Bike is: "+b.getSpeed());
//	System.out.println("Speed of Bike is: "+b.getColor());
//	
//	Car c = new Car();
//	System.out.println("Speed of Car is: "+c.getSpeed());
//	System.out.println("Color of Car is: "+c.getColor());
//	
//	}
//
//}










abstract class Vehicle {
	abstract float getSpeed();
	abstract String getColor(); 
}

class Car extends Vehicle{
	public float getSpeed() {
		return 80.5f;
	}
	
	public String getColor() {
		return "Black";
	}
}

class Bike extends Vehicle{

	@Override
	float getSpeed() {
		
		return 40.5f;
	}

	@Override
	String getColor() {
		
		return "blue";
	}
	
}

public class Abstraction1 {
	public static void main(String[] args) {
	
	Bike b = new Bike();
	System.out.println("Speed of Bike is: "+b.getSpeed());
	System.out.println("Color of Bike is: "+b.getColor());
	
	Car c = new Car();
	System.out.println("Speed of Car is: "+c.getSpeed());
	System.out.println("Color of Car is: "+c.getColor());
	
	}

}

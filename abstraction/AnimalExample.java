//Create an abstract class called Animal with abstract methods eat() and sound(). Create subclasses Dog, Cat, and Cow that inherit from Animal and implement the eat() and sound() methods.

package abstraction;

abstract class Animal{
	abstract String eat();
	abstract String sound();
}
class Dog extends Animal{

	@Override
	String eat() {
		// TODO Auto-generated method stub
		return "Dog eats";
	}

	@Override
	String sound() {
		// TODO Auto-generated method stub
		return "Dog's voice";
	}
	
}

class Cat extends Animal {

	@Override
	String eat() {
		// TODO Auto-generated method stub
		return "Cat eats";
	}

	@Override
	String sound() {
		// TODO Auto-generated method stub
		return "Cat's voice";
	}
	
}  

class Cow extends Animal {

	@Override
	String eat() {
		// TODO Auto-generated method stub
		return "Cow  eats";
	}

	@Override
	String sound() {
		// TODO Auto-generated method stub
		return "Cow's voice";
	}
	
}

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		System.out.println(dog.eat());
		System.out.println(dog.sound());
		
		Cat cat = new Cat();
		System.out.println(cat.eat());
		System.out.println(cat.sound());
		
		Cow cow = new Cow();
		System.out.println(cow.eat());
		System.out.println(cow.sound());

	}

}

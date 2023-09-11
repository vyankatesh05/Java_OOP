package polymorphisam;

class Student{
	public String name;
	public int age;

	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name + " "+ age);
	}
}

public class Polymorphisam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.name = "VPP";
		stu.age = 23;
		stu.printInfo(stu.name, stu.age);
	}

}

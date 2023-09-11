package encapsulation;

class Employee
{
	 int empno;
	 String name;
	 String city;
	//getter and setter method
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	 
}
public class TestEncapsulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEmpno(101);
		emp.setName("XYZ");
		emp.setCity("Mumbai");
		
		System.out.println("EmpNo: "+emp.getEmpno());
		System.out.println("EmpName: "+emp.getName());
		System.out.println("Empcity: "+emp.getCity());

	}

}

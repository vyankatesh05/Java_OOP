package encapsulation;

class Student
{
	private int rollno;
	private String name;
	private String city;
	
	public void setValue()
	{
		rollno=101;
		name="Anil";
		city="Pune";
	}
	
	public void getvalue()
	{
		System.out.println(rollno+","+name+","+city);
	}
}

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.setValue();
		st.getvalue();

	}

}

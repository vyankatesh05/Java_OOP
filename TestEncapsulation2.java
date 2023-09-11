package encapsulation;

class Students
{
	 int rollno;
	 String name;
	 String city;
	
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

public class TestEncapsulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st = new Students();
		st.setValue();
		st.getvalue();
		st.name="Abc";
		st.city="Mumbai";
		st.rollno=102;
		st.getvalue();

	}

}

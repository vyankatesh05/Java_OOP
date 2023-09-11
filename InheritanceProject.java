package inheritance;


class Employee1
{
    private int empno;
    private String name;
    
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
    
    
}
class HR extends Employee1
{
    private float salary;
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
}
class Tax extends HR
{
    private float tax_amount;
    HR obj1=new HR();
    
    public float calcTax()
    {
    
        float salary=getSalary();
    if(salary>=75000 && salary<=90000)
    {
        tax_amount=salary*0.25f;
    }
    else if(salary>=60000 && salary<75000)
    {
        tax_amount=salary*0.18f;
    }
    
    else if(salary>=45000 && salary<60000)
    {
        tax_amount=salary*0.12f;
    }
    
//    System.out.println("Empno:" +obj.getEmpno() );
//    System.out.println("Emp name:" +obj.getName() );
//    System.out.println("Emp salary:" +salary );
    //System.out.println("Tax amount:" +tax_amount );
    return tax_amount;
    }
}
public class InheritanceProject {
    public static void main(String[] args) {
    Tax obj=new Tax();
        obj.setEmpno(111);
    obj.setName("Anil Giri");
    obj.setSalary(60000.00f);
    System.out.println("Empno: "+obj.getEmpno());
    System.out.println("Emp Name: "+obj.getName());
    System.out.println("Emp Salary: "+obj.getSalary());
     System.out.println("Tax amount: "+obj.calcTax());
    }
}
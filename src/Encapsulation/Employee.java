public class Employee extends Person{
    double salary;
    public Employee(String f,String l, double p,Byte a, int ssn)
    {
        super(f,l,a,ssn);
        salary = p;

    }

    public void speak()
    {
        System.out.println(super.getFirstName() + " " + super.getLastName() + " " + salary);
    }
    
}

class Member
{
    private String name;
    private int age;
    private String phone_number;
    private Double salary;
    private String address;
    
    public Member(String name, int age, String phone_number,Double salary,String address)
    {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.salary = salary;
        this.address = address;
    }
    protected void PrintSalary()
    {
        System.out.println(salary);
    }
    protected void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
        System.out.println("Phone Number: " + phone_number );
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}
class Employee extends Member{
    String Specialization;
    public Employee(String name, int age, String phone_number,Double salary,String address,String Specialization)
    {
        super(name, age,phone_number,salary,address);
        this.Specialization = Specialization;
    }
    public void printSpecialization()
    {
        System.out.println("Specialization: "+Specialization);
    }
}
class Manager extends Member{
    String Department;
    public Manager(String name, int age, String phone_number,Double salary,String address,String Department)
    {
        super(name, age,phone_number,salary,address);
        this.Department = Department;
    }
    public void printDepartment()
    {
        System.out.println("Department: " + Department);
    }
}
public class Q7 {
    public static void main(String[] args) {
        Employee Employee1 = new Employee("Ashish Gupta",18,"7208506052",75000.0,"Mumbai","AI And DS");
        Manager manager1 = new Manager("Karan Gupta",20,"7208506052",100000.0,"Mumbai","Electrical");
        System.out.println("Information of Employee: ");
        Employee1.printSpecialization();
        Employee1.printInfo();
        System.out.println("\n\n");
        System.out.println("Information of Manager: ");
        manager1.printDepartment();
        manager1.printInfo();

    }
}

package inheritanceDemo;
// TODO: Create an class called Employee
class Employee {
    private String name;
    private double salary;

    public Employee(){}
    
    // As Parameterized Constructor has been declared, it is mandatory to declare Default Constructor as JVM will 
    // not generate the default one.
    // else the child constructor should called the parent's Parameterized Constructor using super method.
    public Employee(String name, double salary){  
        this.name = name;
        this.salary = salary;
    }
        
    public String getDetails(){
        return "Name: " + name + ", Salary: " + salary; 
    }
        
}


// TODO: Create a class Manager that:
// - Extends Employee
class Manager extends Employee{
    
    private String name;
    private double salary;
    private String department;
    
    public Manager(String name, double salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    
    public Manager() {}

    public String getDetails(){
        return "Name: " + name + ", Salary: " + salary + ", Department: " + department; 
    }
}


public class InheritanceDemo2 {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        Employee e = new Employee("Alice",50000.0);
        Manager m = new Manager("Bob",80000.0,"IT");
        
        // TODO: Print their details using getDetails()
        System.out.println(e.getDetails());
        System.out.println(m.getDetails());
    }
}

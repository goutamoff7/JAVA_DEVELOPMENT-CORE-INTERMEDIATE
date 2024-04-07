package association;
// 1:1 Association
class Address {
    String city;
    String district;
    String state;
    int pinCode;
    public Address(String city, String district, String state, int pinCode) 
    {
        this.city = city;
        this.district = district;
        this.state = state;
        this.pinCode = pinCode;
    }
    @Override
    public String toString() {
        return "[city=" + city + ", district=" + district + ", state=" + state + ", pinCode=" + pinCode + "]";
    }
    
    
}
class Student
{
    String name;
    int age;
    Address address;
    public Student(String name, int age, Address address) 
    {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }
    
    
}
class AssociationDemo
{
    public static void main(String[] args) {
        Address add = new Address("Barjora","Bankura","West Bengal",722202);
        Student std = new Student("Goutam Dam",26,add);
        System.out.println(std);

    }
}
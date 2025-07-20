package typeCasting;

class A{
    public void show1(){
        System.out.println("In A Show");
    }
}

class B extends A {

    public void show2(){
         System.out.println("In B Show");
    }
}


public class TypeCastingDemo {
    public static void main(String[] args) {
        A obj = new A(); 
        obj.show1();
        // obj.show2(); // Reference of A can't directly access B class' method

        A obj2 = new B();  // Upcasting - Child class B reference first Upcasted to class A, done automatically
        obj2.show1();
        // obj2.show2(); // Reference of A can't directly access B class' method need to Downcasting
        
        ((B)obj2).show2(); // Downcasting - Parent class A reference first downcasted to class B then called the method


        B obj3 = new B();
        obj3.show1();
        obj3.show2();



    }  
    
}

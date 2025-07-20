package inheritanceDemo;

class Parent {
    // Static variable
    static String staticVarParent = "Static Variable in Parent";

    // Instance variable
    String instanceVarParent = "Instance Variable in Parent";

    // Static block
    static {
        System.out.println("Static Block in Parent");
    }

    // Instance block
    {
        System.out.println("Instance Block in Parent");
    }

    // Constructor
    public Parent() {
        System.out.println("Constructor of Parent");
    }
}

class Child extends Parent {
    // Static variable
    static String staticVarChild = "Static Variable in Child";

    // Instance variable
    String instanceVarChild = "Instance Variable in Child";

    // Static block
    static {
        System.out.println("Static Block in Child");
    }

    // Instance block
    {
        System.out.println("Instance Block in Child");
    }

    // Constructor
    public Child() {
        System.out.println("Constructor of Child");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("Main Method Starts");

        // Creating an object of Child class
        Child obj = new Child();

        System.out.println("Main Method Ends");
    }
}



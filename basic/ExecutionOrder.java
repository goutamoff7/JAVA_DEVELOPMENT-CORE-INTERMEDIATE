package basic;

    class Parent {
    static {
        System.out.println("Parent static block");
    }
    {
        System.out.println("Parent instance block");
    }
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    static {
        System.out.println("Child static block");
    }
    {
        System.out.println("Child instance block");
    }
    Child() {
        System.out.println("Child constructor");
    }
}

public class ExecutionOrder {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}



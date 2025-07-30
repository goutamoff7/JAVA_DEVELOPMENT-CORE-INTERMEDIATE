package basic;

class A{

public void run(){

System.out.println("I am running");

}

}

class TestCode {

static A obj = new A(){};

public static void main(String []args){  
    
    obj.run();

}

}

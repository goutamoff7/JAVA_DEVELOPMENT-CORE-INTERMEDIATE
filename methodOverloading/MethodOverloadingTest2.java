package methodOverloading;
class Test2 {

public void m1(String s){

System.out.println("String arg method");

}

public void m1(Object d){

System.out.println("Object arg method");

}
}
class MethodOverloadingTest2{

public static void main(String[] args) {

Test2 t = new Test2();

t.m1("sachin");//String arg method

t.m1(new Object());//Object arg method

t.m1(null);//String arg method

}

}


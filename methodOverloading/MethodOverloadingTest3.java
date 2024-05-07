package methodOverloading;
class Test3 {

public void m1(String s){

System.out.println("String arg method");

}

public void m1(StringBuffer d){

System.out.println("StringBuffer arg method");

}
}
class MethodOverloadingTest3{

public static void main(String[] args) {

Test3 t = new Test3();

t.m1("sachin");//String arg method

t.m1(new StringBuffer("dhoni"));//StringBuffer arg method

//t.m1(null);//CE

}

}



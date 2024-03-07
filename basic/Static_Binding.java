package basic;

class Static_Binding
{
  private void eat()
  {
    System.out.println("The Animal is Eating");
  }
  public static void main(String args[])
  {
    Static_Binding ob=new Static_Binding();
    ob.eat();
  }
}

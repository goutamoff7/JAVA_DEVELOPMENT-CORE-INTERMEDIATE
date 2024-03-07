package basic;

class Car
{
  void run()
  {
    System.out.println("The Car is Running");
  }
}
class Alto extends Car
{
  void run()
  {
    System.out.println("The Car is running safely with 60km speed");
  }
}
class Dynamic_Binding
{
  public static void main(String args[])
  {
    Car ob=new Alto(); //This is the upcasting
    ob.run();
  }
}

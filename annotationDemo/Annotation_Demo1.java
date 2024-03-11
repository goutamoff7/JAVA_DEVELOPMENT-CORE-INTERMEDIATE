package annotationDemo;

class Animal
{
    public void getSound()
    {
        System.out.println("Every Animal has different Sound");
    }
}

class Dog extends Animal
{
    // Override getSound method of Animal class
    // Here the method name is intentionally misspelled, Hence the actual getSound() method of Animal class has not been overridden and a specialized method has been created, for this reason when we call getSound() method using Dog class object we will get an output of getSound() method of Animal class and that's not what we expected. 
    public void getSoud()   
    {
        System.out.println("Dog is Barking");
    }
}

class Cat extends Animal
{
    // Here also the method name is intentionally misspelled, but due to @Override annotation we are getting a compilation error
    @Override
    public void getSoud()
    {
        System.out.println("Cat is meowing");
    }
}

class Cow extends Animal
{
    // Here the actual getSoud() method of Animal class has been Overridden and we are not getting any error
    @Override
    public void getSound()
    {
      System.out.println("Cow is mooing");  
    }
}
public class Annotation_Demo1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.getSound();  
        Animal cat = new Cat();
        cat.getSound();
        Animal cow = new Cow();
        cow.getSound();

    }
}

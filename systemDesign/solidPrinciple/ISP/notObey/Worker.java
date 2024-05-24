package systemDesign.solidPrinciple.ISP.notObey;

public interface Worker
{
    void works();
    void managePeople();
    void writeCode();
}

class Manager implements Worker
{
    @Override
    public void works()
    {
        System.out.println("Manager is Working");
    }
    @Override
    public void managePeople()
    {
        System.out.println("Manager is managing");
    }
    @Override
    public void writeCode() // This method not required here
    {
        System.out.println("This is Dummy code, just to implement this method");
    }
}

class Programmer implements Worker
{
    @Override
    public void works()
    {
        System.out.println("Programmer is Working");
    }
    @Override
    public void managePeople()// This method not required here
    {
        System.out.println("This is Dummy code, just to implement this method");
    }
    @Override
    public void writeCode()
    {
        System.out.println("Programmer writes code");
    }
}

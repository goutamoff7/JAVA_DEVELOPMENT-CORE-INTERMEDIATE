package systemDesign.solidPrinciple.LSP.obey;

class Bird
{
    public void fly()
    {
        System.out.println("Bird is Flying");
    }
}

class Penguin extends Bird
{
    @Override
    public void fly()
    {
        System.out.println("Penguin can't fly");
    }
}

class Sparrow extends Bird
{

}

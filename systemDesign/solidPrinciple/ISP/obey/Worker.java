package systemDesign.solidPrinciple.ISP.obey;

interface Worker
{
    void works();
}

interface Manageable extends Worker
{
    void managePeople();
}

interface Programmable extends Worker
{
    void writeCode();
}

class Manager implements Manageable
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
}

class Programmer implements Programmable
{
    @Override
    public void works()
    {
        System.out.println("Programmer is Working");
    }
    @Override
    public void writeCode()
    {
        System.out.println("Programmer writes code");
    }
}

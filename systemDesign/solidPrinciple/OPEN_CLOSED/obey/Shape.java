package systemDesign.solidPrinciple.OPEN_CLOSED.obey;

interface Shape
{
    void draw();
}

class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Rectangle");
    }
}

class Circle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}
//if we want to add another type of shape to draw
//then we can easily add a new class and implements
//draw method

class Triangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Triangle");
    }
}

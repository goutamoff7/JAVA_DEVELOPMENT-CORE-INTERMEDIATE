package systemDesign.solidPrinciple.LSP.obey;
interface Icolour
{
    void getColour();
}
class Green implements Icolour
{
    public void getColour()
    {
        System.out.println("Green");
    }
}
class Blue implements Icolour
{
    @Override
    public void getColour()
    {
        System.out.print("Blue");
    }
}
class Colour
{
    public static void main(String[] args) {
        Icolour icolour = new Blue();
        icolour.getColour();
    }
}
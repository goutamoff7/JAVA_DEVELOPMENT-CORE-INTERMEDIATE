package systemDesign.solidPrinciple.LSP.notObey;

class Green
{
    public void getColour()
    {
        System.out.println("Green");
    }
}
class Blue extends Green
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
        Green green = new Blue();
        //getting output as Blue of Green class reference
        // which violates LSP
        green.getColour();
    }
}
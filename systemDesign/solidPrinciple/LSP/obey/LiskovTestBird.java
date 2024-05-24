package systemDesign.solidPrinciple.LSP.obey;

public class LiskovTestBird {
    public static void makeBirdFly(Bird bird)
    {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird sparrow = new Sparrow();

        // gives penguin can't fly that obey LSP
        makeBirdFly(penguin);
        makeBirdFly(sparrow);
    }
}

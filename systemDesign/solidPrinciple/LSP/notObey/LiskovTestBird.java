package systemDesign.solidPrinciple.LSP.notObey;

public class LiskovTestBird {
    public static void makeBirdFly(Bird bird)
    {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird penguin = new Penguin();
        Bird sparrow = new Sparrow();

        // gives Bird is Flying, but penguin can't fly
        //that violates LSP
        makeBirdFly(penguin);
        makeBirdFly(sparrow);
    }
}

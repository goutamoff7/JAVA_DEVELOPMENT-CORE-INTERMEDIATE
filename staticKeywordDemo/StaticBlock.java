package staticKeywordDemo;
public class StaticBlock {
    static {
        System.out.println("Static block is executed.");
    }

    public static void main(String[] args) {
        System.out.println("Main method is executed.");
    }
}

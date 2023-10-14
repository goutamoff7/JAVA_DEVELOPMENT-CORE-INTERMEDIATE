public class Increment_Decrement_Operator {
    public static void main(String[] args) {
        int a=5,b=0;
        b=a++ + --a + ++a - --a + a-- + ++a;
        System.out.println(a);
        System.out.println(b);
        
        a=5;
        b=0;
        b=a++ + ++a + ++a + a++ + --a + a--;
        System.out.println(a);
        System.out.println(b);        
    }
}

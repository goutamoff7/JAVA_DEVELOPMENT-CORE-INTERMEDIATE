package basic;

class Increment_DecrementOperator2
{
    public static void main(String[] args) {

        int a =5;
        a= a++ + --a + ++a - --a + a-- + ++a;
        System.out.println(a);
    }
}
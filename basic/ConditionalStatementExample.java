package basic;

public class ConditionalStatementExample {
    public static void main(String[] args) {
        {
            int a=10,b=20;
            System.out.print(a==10 && a<20);
            System.out.print(a>10 && a==10);

            System.out.println();

            System.out.print(a>10 || a<10);	
            System.out.print(a==10 || a>10);

            System.out.println();

            System.out.print(a>b ? "a is larger": "b is larger");

        }
            
    }
}

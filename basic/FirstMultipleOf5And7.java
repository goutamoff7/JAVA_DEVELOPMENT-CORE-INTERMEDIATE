//print the first multiple of 5 which is also a multiple of 7
public class FirstMultipleOf5And7 {
    public static void main(String[] args) {
        for(int i=1; ;i++)
        {
            if(i%5==0 && i%7==0)
            {
                System.out.println("The First multiple of 5 which is also a multiple of 7 = "+i);
                break;
            }
        }
    }
}

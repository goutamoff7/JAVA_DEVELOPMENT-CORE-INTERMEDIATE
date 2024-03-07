package basic;

//print day name based upon the day number ( Monday-1, Tuesday-2)
import java.util.Scanner;
public class DayName_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Day Number:");
        int dayNum=sc.nextInt();
        switch(dayNum)
        {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default:System.out.println("Enter valid Day Number");
        }
    }
}

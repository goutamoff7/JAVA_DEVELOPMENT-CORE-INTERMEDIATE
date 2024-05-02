package dateTime;
import java.time.LocalDate;
import java.time.LocalTime;
public class CurrentDateTime 
{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date : "+date);
        LocalTime time = LocalTime.now();
        System.out.println("Current Time :"+time);
    }
}

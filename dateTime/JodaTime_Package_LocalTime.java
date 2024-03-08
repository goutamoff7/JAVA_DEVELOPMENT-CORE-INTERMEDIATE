package dateTime;
import java.time.*;
public class JodaTime_Package_LocalTime 
{
    public static void main(String[] args) 
    {
        LocalTime time = LocalTime.now(); // LocalTime class has no constructor, hence, we have to call static now() method to create object of LocalTime class
        System.out.println(time);

        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int nanoSecond = time.getNano();

        System.out.println("Current Time : "+hour+":"+minute+":"+second+":"+nanoSecond);
    }
}

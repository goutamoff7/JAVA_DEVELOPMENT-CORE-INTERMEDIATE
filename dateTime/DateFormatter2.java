package dateTime;
import java.time.LocalDate;
public class DateFormatter2 
{
   public static void main(String[] args) 
   {    
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println("Formatted Date : "+month+"/"+day+"/"+year);
    }     
}

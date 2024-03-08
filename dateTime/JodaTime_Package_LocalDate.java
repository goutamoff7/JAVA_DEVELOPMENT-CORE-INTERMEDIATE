package dateTime;
import java.time.*;

public class JodaTime_Package_LocalDate 
{
    public static void main(String[] args) 
    {
        
        LocalDate date = LocalDate.now(); // LocalDate class has no constructor, hence, we have to call static now() method to create object of LocalDate class
        System.out.println(date);
    
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.out.println("Today's Date : "+day+"/"+month+"/"+year);

        Month monthName = date.getMonth();  // Reference type is of Month Enums
        System.out.println("Current Month : "+monthName);    // prints Month name "JANUARY,FEBRUARY....."  

        int dayOfYear = date.getDayOfYear();
        System.out.println("Days elapsed in "+year+" : "+dayOfYear+" Days");  // prints current no of day in 365 days 

        DayOfWeek dow = date.getDayOfWeek(); // Reference type is of DayOfWeek Enums
        System.out.println("Current Day in Week : "+dow); // prints Day name "MONDAY,TUESDAY...."  

        boolean leapYear = date.isLeapYear();
        System.out.println(year+" is Leap Year : "+leapYear); // prints true if current year is leapYear

        int lom = date.lengthOfMonth();
        System.out.println(monthName+" has "+lom+" Days"); // prints Total no of days in the current month "31,30,29,28" days
        int loy= date.lengthOfYear(); 
        System.out.println("Total No of Days in "+year+" : "+loy); // Total no of days in the current year "365,366" days
        
    }
}

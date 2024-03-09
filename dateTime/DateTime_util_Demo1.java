package dateTime;
import java.util.Date;
class DateTime_util_Demo1 {
    public static void main(String[] args) {
        Date d = new Date(); // Date class in util package, Zero parameterised
    System.out.println(d); // prints time and date both with zone
        long timeInMs = d.getTime(); 
    System.out.println(timeInMs); // prints time in mili Sec

        java.sql.Date ds = new java.sql.Date(timeInMs); // Date class in sql package extends Date class of Util package, it requires long type data, returns only date.java.sql.Date used in database operation.
    System.out.println(ds); // prints only current date (YYYY-MM-DD) FORMAT

        long timeInMs2 = ds.getTime(); 
    System.out.println(timeInMs2);// prints current time in mili Sec

        java.sql.Time t = new java.sql.Time(timeInMs2); 
    System.out.println(t); // prints only current time (HH:MM:SS) 24 HRS FORMAT

        java.sql.Timestamp ts = new java.sql.Timestamp(timeInMs2);
    System.out.println(ts); // prints time and date both, not time zone

    }    
}

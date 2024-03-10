package enumDemo;

public class Enum_SwitchCase {
    enum Week
    {
        SUN,MON,TUE,WED,THU,FRI,SAT;
    }
    
    public static void main(String[] args) {
        
        //Week choice = Week.SUN;
        // Week choice = Week.MON;
        Week choice = Week.TUE;
        // Week choice = Week.WED;
        // Week choice = Week.THU;
        // Week choice = Week.FRI;
        // Week choice = Week.SAT;
        switch(choice)
        {
            case SUN :  System.out.println("Hurray! Sunday means Holiday");
                        break;
            case MON :  System.out.println("Monday is a Working Day");
                        break;
            case TUE :  System.out.println("Tuesday is a Working Day");
                        break;
            case WED :  System.out.println("Wednesday is a Working Day");
                        break;
            case THU :  System.out.println("Thursday is a Working Day");
                        break;
            case FRI :  System.out.println("Friday is a Working Day");
                        break;
            case SAT :  System.out.println("Saturday is a Half Working Day");
                        break;
        }       

    }
}

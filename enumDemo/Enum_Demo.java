package enumDemo;
import java.lang.Enum; //in-built Enum abstract class in java
class Enum_Demo {
    //Java enums are implicitly final subclasses of java.lang.Enum class
    // enumerator used to define a group of named constants, convention : CAPITAL LETTERS
   enum Direction  
   {
        NORTH,SOUTH,EAST,WEST; 
   } 
   public static void main(String[] args) {
    
    enum Result 
    {
        PASS,FAIL;
    }
        //Direction d = new Direction();// CE: can't make an object of enum
        Direction d = Direction.NORTH;
        System.out.println(d);

        Result r = Result.FAIL;
        System.out.println(r);

        int i = Direction.SOUTH.ordinal();
        System.out.println(i);

        Direction ar[] = Direction.values();
        for(Direction dir:ar)
            System.out.println(dir+" : "+dir.ordinal());

        // Get the Class object for the enum class 
        Class cl = Result.class;
        for(Object obj:cl.getEnumConstants())
            System.out.print(obj+", ");

        System.out.println();
        
        
        // Get the Class object for the enum class
        Class<Direction> c = Direction.class;
        Direction ar2[] = c.getEnumConstants();
        for(Direction dir:ar2)
            System.out.print(dir+", ");


   }
}

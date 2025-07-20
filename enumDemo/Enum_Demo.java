package enumDemo;
import java.lang.Enum; //in-built Enum abstract class in java
class Enum_Demo {
    //Java enums are implicitly extends of java.lang.Enum class
    // enumerator used to define a group of named constants, convention : CAPITAL LETTERS

   enum Direction  
   {
        NORTH,SOUTH,EAST,WEST; 
   } 

//behind the scene : 
/*
final class Direction extends java.lang.Enum<Direction> {
    public static final Direction NORTH = new Direction("NORTH", 0);
    public static final Direction SOUTH = new Direction("SOUTH", 1);
    public static final Direction EAST = new Direction("EAST", 2);
    public static final Direction WEST = new Direction("WEST", 3);

    private Direction(String name, int ordinal) {
        super(name, ordinal);
    }

    public static Direction[] values() {
        return new Direction[] { NORTH, SOUTH, EAST, WEST };
    }

    public static Direction valueOf(String name) {
        // returns the constant with the given name
    }
}
}*/
   public static void main(String[] args) {
    
    // enums can be declared inside the method body //
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

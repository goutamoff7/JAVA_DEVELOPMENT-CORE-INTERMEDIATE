package enumDemo;

class Enum_Constructor
{
       enum Direction  
       {
            //int angle; // can't declare variable here
            EAST,WEST,NORTH,SOUTH;
            //behind the scene : 
            //public static final Direction EAST = new Direction();
            //public static final Direction WEST = new Direction();
            //public static final Direction NORTH = new Direction();
            //public static final Direction SOUTH = new Direction();
            
            private int angle;

            //Constructor
            Direction()
            {
                System.out.println("Moving towards "+this+" direction");
            }
            
            public int getAngle() {
                return angle;
            }

            public void setAngle(int angle) {
                this.angle = angle;
            }
            
       } 
    public static void main(String[] args) {
         
        Direction.EAST.setAngle(0);
        Direction.WEST.setAngle(180);
        Direction.NORTH.setAngle(90);
        Direction.SOUTH.setAngle(270);

        System.out.println(Direction.EAST+" : "+Direction.EAST.getAngle()+" Degree");
        System.out.println(Direction.WEST+" : "+Direction.WEST.getAngle()+" Degree");
        System.out.println(Direction.NORTH+" : "+Direction.NORTH.getAngle()+" Degree");
        System.out.println(Direction.SOUTH+" : "+Direction.SOUTH.getAngle()+" Degree");
        System.out.println(Enum.getEnumConstants());

        
    }
}
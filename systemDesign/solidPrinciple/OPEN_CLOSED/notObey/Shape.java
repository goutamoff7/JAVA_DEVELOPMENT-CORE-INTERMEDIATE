package systemDesign.solidPrinciple.OPEN_CLOSED.notObey;

import java.sql.SQLOutput;

public class Shape
{
    //Method to draw different shapes
    public void draw(int type)
    {
        if(type==1)
            System.out.println("Drawing a Rectangle");
        if(type==2)
            System.out.println("Drawing a Circle");
//if we want to add another type of shape to draw
//then we have to modify this class which violates
//the Open Closed Principle.

    }

}

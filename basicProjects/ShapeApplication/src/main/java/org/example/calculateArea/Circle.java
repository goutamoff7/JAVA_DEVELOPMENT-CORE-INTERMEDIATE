package org.example.calculateArea;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape
{
    private float radius;
    private float area;

    @Override
    public void acceptInput()
    {
        System.out.print("Enter the Radius of the Circle : ");
        radius = scan.nextFloat();
    }
    @Override
    public void compute()
    {
        area = 3.141f*radius*radius;
    }
    @Override
    public void disp()
    {
        System.out.println("The Area of Circle : "+area);
    }

}

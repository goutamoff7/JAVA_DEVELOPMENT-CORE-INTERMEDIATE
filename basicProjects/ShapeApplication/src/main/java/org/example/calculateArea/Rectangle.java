package org.example.calculateArea;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape
{
    private float length;
    private float breadth;
    private float area;

    @Override
    public void acceptInput()
    {
        System.out.print("Enter the Length of the Rectangle : ");
        length = scan.nextFloat();
        System.out.print("Enter the Length of the Rectangle : ");
        breadth = scan.nextFloat();
    }

    @Override
    public void compute()
    {
        area = length*breadth;
    }
    @Override
    public void disp()
    {
        System.out.println("The Area of Rectangle : "+area);
    }

}

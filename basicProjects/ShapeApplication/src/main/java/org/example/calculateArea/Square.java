package org.example.calculateArea;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape
{
    private float length;
    private float area;

    @Override
    public void acceptInput()
    {
        System.out.print("Enter the Length of the Square : ");
        length = scan.nextFloat();
    }

    @Override
    public void compute()
    {
        area = length*length;
    }
    @Override
    public void disp()
    {
        System.out.println("The Area of Square : "+area);
    }

}

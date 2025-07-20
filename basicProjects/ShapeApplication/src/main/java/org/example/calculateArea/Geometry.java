package org.example.calculateArea;

import org.springframework.stereotype.Component;

@Component
public class Geometry
{
    public void permit(Shape ref)
    {
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}


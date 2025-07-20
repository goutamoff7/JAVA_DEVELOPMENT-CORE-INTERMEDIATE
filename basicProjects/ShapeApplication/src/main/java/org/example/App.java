package org.example;
import org.example.calculateArea.Geometry;
import org.example.calculateArea.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext =  new AnnotationConfigApplicationContext("org.example");
        Geometry geometry=(Geometry)applicationContext.getBean("geometry");

        Shape shape =(Shape)applicationContext.getBean("rectangle");
        geometry.permit(shape);
        shape =(Shape)applicationContext.getBean("square");
        geometry.permit(shape);
        shape =(Shape)applicationContext.getBean("circle");
        geometry.permit(shape);

    }
}

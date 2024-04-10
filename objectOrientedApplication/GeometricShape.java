package objectOrientedApplication;

import java.util.Scanner;

abstract class Shape
{
	float area;
	abstract public void acceptInput();
	abstract public void compute();
	public void disp()
	{
		System.out.println("The area is: "+area);
	}
	Scanner scan = new Scanner(System.in);
	
}

class Square extends Shape
{
	private float length;

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
	
}

class Rectangle extends Shape
{
	private float length;
	private float breadth;

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
	
}

class Circle extends Shape
{
	private float radius;

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
	
}

class Geometry
{
	public void permit(Shape ref)
	{
		ref.acceptInput();
		ref.compute();
		ref.disp();
	}
}

public class GeometricShape 
{

	public static void main(String[] args) 
	{
		Square s = new Square();
		Rectangle r =new Rectangle();
		Circle c = new Circle();
		
		Geometry g = new Geometry();
		
		g.permit(s);
		g.permit(r);
		g.permit(c);

	}

}

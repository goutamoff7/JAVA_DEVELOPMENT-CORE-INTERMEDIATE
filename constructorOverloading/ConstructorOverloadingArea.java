public class ConstructorOverloadingArea {
	ConstructorOverloadingArea(int len,int brdth)
	{
		System.out.println("Area of Square = "+len*brdth+" Sqr mtr");
	}
	ConstructorOverloadingArea(int rad)
	{
		System.out.println("Area of Circle = "+3.14*rad*rad+" Sqr mtr");
	}
	ConstructorOverloadingArea(float base,float alt)
	{
		System.out.println("Area of Triangle = "+0.5*base*alt+" Sqr mtr");
	}
	public static void main(String[] args) {
		
		new ConstructorOverloadingArea(5,6);
		new ConstructorOverloadingArea(5);
		new ConstructorOverloadingArea(5f,6f);
		
	}	
}

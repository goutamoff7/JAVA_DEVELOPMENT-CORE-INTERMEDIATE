package systemDesign.factoryDesignPattern;

interface GreetingService
{
	void greet(String name);
}

class EnglishGreetingService implements GreetingService
{
	@Override
	public void greet(String name)
	{
		System.out.println("Hello "+name);
	}
}

class FrenchGreetingService implements GreetingService
{
	@Override
	public void greet(String name)
	{
		System.out.println("Bonjour "+name);
	}
}
class GreetingServiceFactory // creating objects 
{
	public GreetingService getGreetingService(String language) // return Interface type reference of the implementing objects
	{
		if(language.equalsIgnoreCase("english"))
			return new EnglishGreetingService();
		else if(language.equalsIgnoreCase("french"))
			return new FrenchGreetingService();
		else
			throw new RuntimeException("No other Languages are Currently Available");
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		GreetingServiceFactory gsf = new GreetingServiceFactory();
		GreetingService gs = gsf.getGreetingService("English");
		gs.greet("Goutam");
		gs = gsf.getGreetingService("french");
		gs.greet("Goutam");

	}

}

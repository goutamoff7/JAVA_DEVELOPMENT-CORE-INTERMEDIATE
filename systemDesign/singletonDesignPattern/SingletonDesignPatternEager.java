package systemDesign.singletonDesignPattern;

class Book2
{
	private static Book2 book = new Book2();
	private Book2() // Restrict of Creating Multiple instance by user
	{}
	public static Book2 getBook()
	{
		return book;
	}
}


public class SingletonDesignPatternEager {

	public static void main(String[] args) {
		Book2 book1 = Book2.getBook();
		Book2 book2= Book2.getBook();
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());

	}

}

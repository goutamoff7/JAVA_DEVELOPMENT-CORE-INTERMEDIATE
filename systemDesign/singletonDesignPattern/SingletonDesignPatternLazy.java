package systemDesign.singletonDesignPattern;

class Book
{
	private static Book book;
	private Book() // Restrict of Creating Multiple instance by user
	{}
	public static Book getBook()
	{
		synchronized (Book.class) {
			if(book==null)
				book = new Book();
		}		
		return book;
	}
}


public class SingletonDesignPatternLazy {

	public static void main(String[] args) {
		Book book1 = Book.getBook();
		Book book2 = Book.getBook();
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());

	}

}

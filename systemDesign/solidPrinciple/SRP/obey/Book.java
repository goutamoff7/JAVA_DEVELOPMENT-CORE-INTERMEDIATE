package systemDesign.solidPrinciple.SRP.obey;
//I want to build a Book management system//
public class Book
{
    private String title;
    private String author;
    private String pageCount;
}

class BookDatabase
{
    public void saveToDB() {
        //Code to save book in DB
    }
}

class BookPrinter
{
    public void printBook()
    {
        //Code to print the book
    }
}

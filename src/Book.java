import java.util.Date;

public class Book
{
    private int pages; // Eigenschaften, private wegen getter und setter
    private Date released;
    private String title;
    private String isbn;

    public int getPages() // getter und setter, man fragt danach und es soll die Seiten zurückgeben
    {
        return pages;
    }

    public void setPages(int pages) // es wird ein Wert zugewiesen
    {
        this.pages = pages;
    }

    public Date getReleased()
    {
        return released;
    }

    public void setReleased(Date released)
    {
        this.released = released;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public Book(int pages, Date released, String title, String isbn) // Konstruktor
    {
        this.pages = pages; // mit this greife ich auf die Eigenschaft zu, .pages bestimmt etwas genauer, = für die Wertzuweisung
        this.released = released;
        this.title = title;
        this.isbn = isbn;
    }
}


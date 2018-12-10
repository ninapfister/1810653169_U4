import java.util.Date;

public class Paperbook extends Book // Aufgabe 5
{

    private String series; // Attribute zusätzlich
    private String month;

    public String getSeries() // getter und setter
    {
        return series;
    }

    public void setSeries(String series)
    {
        this.series = series;
    }

    public String getMonth()
    {
        return month;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

    public Paperbook(int pages, Date released, String title, String isbn, String month, String series) // geerbt von Book, neue Attribute dazu, Konstruktor
    {
        super(pages, released, title, isbn); // super wenn es außerhalb der Klasse ist, geerbte Klasse
        this.month = month; // mit this greife ich auf die Eigenschaft zu, .pages bestimmt etwas genauer, = für die Wertzuweisung
        this.series = series;
    }
}



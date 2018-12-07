import java.util.Date;

public class Aufruf
{
    public static void main (String []args)
    {
        Date released = new Date (); // weil ich immer das aktuelle Datum möchte, wenn ich ein bestimmtes will, kann ich einfach das gewünschte Datum in die Klammer schreiben
        Book MyBook = new Book (200,released, "My Book", "isbn" );

        System.out.println("Das Buch hat " + MyBook.getPages()+ " Seiten, wurde am " + MyBook.getReleased() + " veröffentlicht und hat den Titel " + MyBook.getTitle());
        // mit MyBook greife ich auf das Buch/Instanz zu, mit .getPages spreche ich die Methode an, man übernimmt die zuvor übergebenen Werte
    }
}

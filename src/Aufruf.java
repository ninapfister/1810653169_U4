import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf
{
    public static void main (String []args) // Aufgabe 3
    {
        Date released = new Date (); // weil ich immer das aktuelle Datum möchte, wenn ich ein bestimmtes will, kann ich einfach das gewünschte Datum in die Klammer schreiben
        Book myBook = new Book (200,released, "My Book", "isbn" );

        System.out.println("Das Buch hat " + myBook.getPages()+ " Seiten, wurde am " + myBook.getReleased() + " veröffentlicht und hat den Titel " + myBook.getTitle());
        // mit myBook greife ich auf das Buch/Instanz zu, mit .getPages spreche ich die Methode an, man übernimmt die zuvor übergebenen Werte


        // Aufgabe 4

        List<Book> eineListe= new ArrayList<Book>(); // eine Liste erstellen, Konstrukutor für Tabelle
        eineListe.add(new Book (200, released, "My Book 1", "125215-12521-73473")); // auf die Liste zugreifen, mit . etwas genauer bestimmen, Methode, add
        eineListe.add(new Book (200, released, "My Book 2", "6437-623623-24254"));
        eineListe.add(new Book (200, released, "My Book 3", "26326-734737-732473"));
        eineListe.add(new Book (200, released , "My Book 4", "745854-124412-3487438348"));
        eineListe.add(new Book (200, released, "My Book 5", "672-5236236-123483475125"));

        for (Book item:eineListe) // for-each-Schleife weil in Klammer :, läuft solange wie ich Instanzen in meiner Liste habe, hier 5mal
        {
            System.out.println(item.getTitle()+ " hat " + item.getPages()+ " Seiten und folgende ISBN: " + item.getIsbn()); // gibt den Text aus
        }

    }
}

import java.util.Date;

public class Aufruf
{
    public static void main (String[]args)
    {
        Book neu=new Book(200, new Date(),"My Book","1234-1234-1234");
        System.out.println("Das Buch hat " + neu.getPages() + " Seiten, wurde am " + neu.getReleased() + " veröffentlicht und hat den Titel " + neu.getTitle());

    }



}

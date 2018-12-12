import java.awt.print.Paper;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aufruf
{
    public static void main (String[]args)
    {
        Book neu=new Book(200, new Date(),"My Book","1234-1234-1234");
        System.out.println("Das Buch hat " + neu.getPages() + " Seiten, wurde am " + neu.getReleased() + " veröffentlicht und hat den Titel " + neu.getTitle());


        List<Book> Liste= new ArrayList<>();
        Liste.add(new Book(200, new Date(), "Harri Schotter", "0815-0815-0815"));
        Liste.add(new Book(200, new Date(), "Harris Schotter ist aus", "0815-0815-0816"));
        Liste.add(new Book(200, new Date(), "Harris Schotter ist wieder da", "0815-0815-0817"));
        Liste.add(new Book(200, new Date(), "Harri Schotter ohne Schotter", "0815-0815-0818"));
        Liste.add(new Book(200, new Date(), "Harri Schotter und der Tod durch Schotter", "0815-0815-0819"));

        for(Book a:Liste)
        {
            System.out.println(a.getTitle() + " hat " + a.getPages() + " Seiten und folgende ISBN: " + a.getIsbn());
        }

        List<Paperbook> Liste2=new ArrayList<>();
        Liste2.add(new Paperbook("Series 1","Januar", 200, new Date(), "My Paperbook 1", "00000-000000-0000"));
        Liste2.add(new Paperbook("Series 2","Februar", 210, new Date(), "My Paperbook 2", "00000-000000-0000"));
        Liste2.add(new Paperbook("Series 3","März", 240, new Date(), "My Paperbook 3", "00000-000000-0000"));
        Liste2.add(new Paperbook("Series 4","April", 100, new Date(), "My Paperbook 4", "00000-000000-0000"));
        Liste2.add(new Paperbook("Series 5","Mai", 140, new Date(), "My Paperbook 5", "00000-000000-0000"));

        for(Paperbook a:Liste2)
        {
            System.out.println(a.getTitle() + " hat " + a.getPages() + " Seiten und folgende ISBN: " + a.getIsbn() + " zusätzlich ist es im Monat " + a.getMonth() + " erschienen.");
        }

    }



}

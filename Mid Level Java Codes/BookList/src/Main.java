import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Book FarelerVeInsanlar = new Book("Fareler ve Insanlar" , "John Steinback",126,"1937");
        Book MartinEden = new Book("Martin Eden" , "Jack London",393,"1909");
        Book AltinciKogus = new Book("Altıcı Koğuş" , "Anton Chekhov",520,"1892");
        Book SucVeCeza = new Book("Suç ve Ceza" , "Dostoyevski",687,"1866");
        Book HayvanCiftligi = new Book("Hayvan Çiftliği" , "George Orwell",152,"1945");

        Book BinDokuzYuzSekseDort = new Book("1984" , "George Orwell",352,"1949");
        Book SineklerinTanrisi = new Book("Sineklerin Tanrısı" , "Gerald Golding",262,"1954");
        Book Tutunamayanlar = new Book("Tutuanamayanlar" , "Oğuz Atay",724,"1972");
        Book OtomatikPortakal = new Book("Otomatik Portakal" , "Anthony Burgess",176,"1962");
        Book Insanciklar = new Book("İnsancıklar" , "Dostoyevski",179,"1846");

        ArrayList<Book> books = new ArrayList<>();
        books.add(FarelerVeInsanlar);
        books.add(MartinEden);
        books.add(AltinciKogus);
        books.add(SucVeCeza);
        books.add(HayvanCiftligi);
        books.add(BinDokuzYuzSekseDort);
        books.add(SineklerinTanrisi);
        books.add(Tutunamayanlar);
        books.add(OtomatikPortakal);
        books.add(Insanciklar);

        ArrayList<Book> newList = new ArrayList<>();

        books.stream()
                .filter(book -> book.getPageCount() > 100)
                .forEach(book -> newList.add(book));

        for (Book book : newList){
            System.out.println("NewList " + book.getBookName() + "\nPage : " + book.getPageCount() + "\n");
        }

        HashMap<String,String> booksMap = new HashMap<>();

        booksMap.put(books.get(0).getBookName(),books.get(0).getAuthor());
        booksMap.put(books.get(1).getBookName(),books.get(1).getAuthor());
        booksMap.put(books.get(2).getBookName(),books.get(2).getAuthor());
        booksMap.put(books.get(3).getBookName(),books.get(3).getAuthor());
        booksMap.put(books.get(4).getBookName(),books.get(4).getAuthor());

        booksMap.put(books.get(5).getBookName(),books.get(5).getAuthor());
        booksMap.put(books.get(6).getBookName(),books.get(6).getAuthor());
        booksMap.put(books.get(7).getBookName(),books.get(7).getAuthor());
        booksMap.put(books.get(8).getBookName(),books.get(8).getAuthor());
        booksMap.put(books.get(9).getBookName(),books.get(9).getAuthor());

        for (String i : booksMap.keySet()) {
            System.out.println(i);
        }

        for (String i : booksMap.values()) {
            System.out.println(i);
        }



    }
}
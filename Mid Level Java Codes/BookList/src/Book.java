import java.util.Date;

public class Book {

    private String bookName;
    private String author;
    private int pageCount;
    private String releaseDate;

    public Book(String bookName, String author, int pageCount, String releaseDate){
        this.bookName = bookName;
        this.author = author;
        this.pageCount = pageCount;
        this.releaseDate = releaseDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName(){
        return this.bookName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}

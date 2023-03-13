package Number_5;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private int code;
    private List<Book> books;

    public Course(int code) {
        this.code = code;
        this.books = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}
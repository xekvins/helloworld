import java.util.Objects;

public class Book {
    private String book;
    private Author author;

    private int bookData;

    public Book(String bookName, Author author, int bookData) {
        this.book = bookName;
        author = author;
        this.bookData = bookData;

    }

   public String getBookName() {
        return this.book;
    }

    public Author getAuthor() {
        return author;

    }

    public int getBookData() {
        return this.bookData;
    }

    public void setBookData(int bookData) {
        this.bookData = bookData;

    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book1 = (Book) o;
        return bookData == book1.bookData && Objects.equals(book, book1.book) && Objects.equals(author, book1.author);
    }


    public int hashCode() {
        return Objects.hash(book, author, bookData);
    }

    @Override
    public String toString() {
        return "Book{" +
                "book='" + book + '\'' +
                ", author=" + author +
                ", bookData=" + bookData +
                '}';
    }
}

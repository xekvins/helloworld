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
}

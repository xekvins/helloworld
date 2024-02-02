public class Book {
    private String bookName;
    private String author;

    private int bookData;

    public Book(String bookName, String author, int bookData) {
        this.bookName = bookName;
        this.author = author;
        this.bookData = bookData;

    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getBookData() {
        return this.bookData;
    }

    public void setBookData(int bookData) {
        this.bookData = bookData;
    }
}

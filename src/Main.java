public class Main {

    public static void main(String[] args) {

        Book book1  = new Book ("Martin Iden", "JAck London", 1909);
        System.out.println("book1.getBookName() = " + book1.getBookName());
        System.out.println("book1.getAuthor() = " + book1.getAuthor());
        System.out.println("book1.getBookData() = " + book1.getBookData());
        Book book2 = new Book("The little Prince", "Antuan De Sent Exupery", 1942);
        System.out.println("book2.getBookName() = " + book2.getBookName());
        System.out.println("book2.getAuthor() = " + book2.getAuthor());
        System.out.println("book2.getBookData() = " + book2.getBookData());


    }
}

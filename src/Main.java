public class Main {

    public static void main(String[] args) {
        Author bookOne = new Author("Джек", "Лондон");
        Author bookTwo = new Author("Антуан", "Де Сент Экзюпери");
        Book book1  = new Book ("Martin Iden",bookOne , 1909);
        System.out.println("book1.getBookName() = " + book1.getBookName());
        System.out.println("book1.getAuthor() = " + bookOne.getName() + " " + bookOne.getSurName());
        System.out.println("book1.getBookData() = " + book1.getBookData());
        Book book2 = new Book("The little Prince", bookTwo, 1942);
        System.out.println("book2.getBookName() = " + book2.getBookName());
        System.out.println("book2.getAuthor() = " + bookTwo.getName() + " " + bookTwo.getSurName());
        System.out.println("book2.getBookData() = " + book2.getBookData());


    }
}

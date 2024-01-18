package extends1.ex4;

public class Book extends Item{

    private String author;
    private String isbn;

    public Book(String name, int place, String author, String isbn) {
        super(name, place);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자 : " + author + ", isbn : " + isbn);
    }
}

package construct;

public class Ex_Book {
    String title;
    String author;
    int page;

    Ex_Book () {
        this("","", 0);
    }
    Ex_Book (String title, String author) {
        this(title, author, 0);
    }

    Ex_Book (String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;

    }
    void displayInfo() {
        System.out.println("제목 : " + title + "저자 : " + author + "페이지 : " + page);
    }
}

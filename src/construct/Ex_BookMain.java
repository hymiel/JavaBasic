package construct;

import java.awt.print.Book;

public class Ex_BookMain {
    public static void main(String[] args) {

    //기본생성자 사용
    Ex_Book book1 = new Ex_Book();
    book1.displayInfo();

    //title과 author만을 매개변수로 받는 생성자
        Ex_Book book2 = new Ex_Book("Hello Java" , "Seo");
        book2.displayInfo();

    // 모든 필드를 매개변수로 받는 생성자
        Ex_Book book3 = new Ex_Book("Hello Java" , "Seo", 700);
        book3.displayInfo();

}
}
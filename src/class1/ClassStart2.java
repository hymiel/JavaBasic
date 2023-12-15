package class1;

public class ClassStart2 {
    public static void main(String[] args) {


    //학생 클래스를 사용한 학생 정보 출력 프로그램 만들기
    Student student1 = new Student(); //참조값이 대입
    student1.name = "학생1";
    student1.age = 15;
    student1.grade = 90;

    Student student2 = new Student();
    student2.name = "학생2";
    student2.age = 16;
    student2.grade = 80;

        System.out.println(student1); // 참조값이 출력됨
        System.out.println(student1.name);
    }
}
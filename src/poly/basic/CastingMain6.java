package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        //자바 16 이상의 Pattern Matching for instanceof
        // instanceof를 사용하면서 동시에 변수 선언이 가능하다

        Parent parent1 = new Parent();
        System.out.println("Parent1 호출");

        call(parent1);

        Parent parent2 = new Child();
        System.out.println("Parent2 호출");
        call(parent2);
}

    private static void  call ( Parent parent) {
        parent.parentMethod();
        //Child 인스턴스 인경우 childMethod() 실행
//        if (parent instanceof  Child) {
//            System.out.println("Child 인스턴스가 맞다");
//            Child child = (Child) parent;
//            child.childMethod();
//        }

            parent.parentMethod();
            if (parent instanceof  Child child) { //변수 선언이 가능
                System.out.println("Child 인스턴스가 맞다");
                child.childMethod();
            }
        }

}
package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        //instanceof : 다운캐스팅을 수행하기 전에
        // 원하는 타입으로 변경이 가능한지 확인 한 다음에 다운캐스팅을 수행하는 것
        Parent parent1 = new Parent();
        System.out.println("Parent1 호출");

        call(parent1);

        Parent parent2 = new Child();
        System.out.println("Parent2 호출");
        call(parent2);
}

    private static void  call ( Parent parent) {
        parent.parentMethod();
        if (parent instanceof  Child) {
            System.out.println("Child 인스턴스가 맞다");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
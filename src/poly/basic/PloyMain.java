package poly.basic;

public class PloyMain {
    public static void main(String[] args) {
        //부모변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();

        //부모변수가 자식 인스턴스 참조 (다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); // 이게 다형적 참조
        poly.parentMethod();

//        Child child1 = new Parent(); // 자식은 부모를 담을 수 없다
        //자식의 기능은 호출할 수 없다. -> 상속관계는 하위로 내려갈 수 없다.
//        poly.childMethod(); //poly는 Parent 타입이기 때문에 자식타입을 모른다.
    }
}

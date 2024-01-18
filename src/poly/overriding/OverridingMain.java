package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("Value -> " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("Value -> " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("Value -> " + poly.value); //value는 parent
        poly.method(); //method는 child

        // 변수는 오버라이딩이 안되고 메서드는 오버라이딩이 된다.
        // 오버라이딩 된 메서드는 항상 우선권을 가짐!!
    }

}

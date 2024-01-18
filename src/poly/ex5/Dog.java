package poly.ex5;

public class Dog implements InterfaceAnimal{
    //인터페이스를 상속받을 때는 implement


    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}

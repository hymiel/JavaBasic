package poly.ex5;

public class Cat implements InterfaceAnimal{
    //인터페이스를 상속받을 때는 implement


    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}

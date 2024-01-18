package poly.ex4;

public class Dog extends AbstractAnimal {

    //추상클래스를 상속받은 자식 클래스에서 추상메서드의 바디를 완성
    //무조건 오버라이딩을 해야만 한다.

    @Override
    public void move() {
        System.out.println("개 이동");
    }

    //구현을 못할경우 자식의 클래스도 추상클래스로 만들어 주어야 한다.
    @Override
    public void sound() {
        System.out.println("멍멍");

    }
}

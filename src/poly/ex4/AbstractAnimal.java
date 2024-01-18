package poly.ex4;

public abstract class AbstractAnimal {

    //자식클래스가 완성을 해야하는 추상메서드
    //순수 추상클래스 (완전한 추상)

    //순수 추상클래스의 경우 실행 로직을 아예 보유하고 있지않다.
    //즉, 다형성을 위한 부모타입으로써 껍데기 제공 역할만하는 것

    //인스턴스 생성이 불가하고 상속 시 자식은 모든 메서드를 오버라이딩해야하기 때문에
    //자식이 오버라이딩하지 않을 가능성이 없다.
    public abstract void sound();
    public abstract void move();
}

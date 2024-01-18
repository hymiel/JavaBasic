package poly.ex3;

public abstract class AbstractAnimal {

    //자식클래스가 완성을 해야하는 메서드
    public abstract void sound(); //추상클래스의 추상메서드(불완전한 메서드)

    //추상메서드는 메서드의 바디가 없기 때문에 작동하지 않은 메서드이다.


    //자식클래스가 상속을 받아서 사용할 수 있는 메서드(오버라이딩이 필수가 아님)
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

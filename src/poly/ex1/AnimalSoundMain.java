package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        //타입이 다 다르기 때문에 배열이나 for문으로 중복제거가 불가능하다.
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        sound(cow);
    }
    private static void sound(Cow cow) {

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}

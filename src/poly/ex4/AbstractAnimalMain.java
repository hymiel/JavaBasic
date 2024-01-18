package poly.ex4;


public class AbstractAnimalMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        maveAnimal(dog);
        maveAnimal(cat);
        maveAnimal(cow);
    }

    //변하지 않는 부분
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }

    private static void maveAnimal(AbstractAnimal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.move();
        System.out.println("동물소리 테스트 종료");
    }
}

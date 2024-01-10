package access;

public class Speaker {
    int volum;
    Speaker(int volum) {
        this.volum = volum;
    }

    void volumUp() {
        if (volum >= 100) {
            System.out.println("음량을 증가할 수 없습니다.");
        } else {
            volum += 10;
            System.out.println("음략을 10 증가합니다.");
        }
    }

    void volumDown() {
        volum -= 10;
        System.out.println("volumDown 호출");
    }

    void showVolum () {
        System.out.println("현재음량 - " + volum);
    }
}

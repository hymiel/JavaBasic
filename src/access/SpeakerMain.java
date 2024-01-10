package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolum();

        speaker.volumUp();
        speaker.showVolum();

        speaker.volumUp();
        speaker.showVolum();

//        //필드에 직접 접근
//        System.out.println("volum 필드에 직접 접근 수정");
//        speaker.volum = 200; //private 접근 오류
//        speaker.showVolum();
    }
}

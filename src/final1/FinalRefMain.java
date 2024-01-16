package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        //Data라는 참조형을 final로 > 참조값 변경은 안돼
        final Data data = new Data();



        //참조 대상의 값은 변경이 가능함
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}

package ref;

public class NullMain {
    public static void main(String[] args) {
        //참조형 변수에 아직 가리키는 대상이 없다면 null로 처리가능
        NullData nullData = null;
        System.out.println(nullData);

        nullData = new NullData();
        System.out.println(nullData);

        nullData = null;
        System.out.println(nullData);
    }
}

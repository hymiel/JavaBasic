package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData initData = new InitData();

        System.out.println("initData.value1 = " + initData.value1);
        //초기회를 하지 않았지만 멤버변수이기 때문에 자동으로 0으로 초기화
        System.out.println("initData = " + initData.value2);
    }
}

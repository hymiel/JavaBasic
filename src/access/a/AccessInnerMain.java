package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccesSData data = new AccesSData();

        //public 호출 가능

        data.publicField = 1;
        data.publicMethod();

        //default 호출 가능 _ 같은 패키지 안에 있기 때문에!

        data.defaultFiled = 2;
        data.defaultMethod();

//        //private 호출 불가
//        data.privateField = 3; //접근 불가능
//        data.privateMethod();

        data.innerAccess();
    }
}

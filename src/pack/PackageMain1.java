package pack;

import pack.a.User;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        //pack.a.User user = new pack.a.User();
        //import가 없으면 이렇게 패키지를 구분해줘야함!
    }
}

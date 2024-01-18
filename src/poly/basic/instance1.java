package poly.basic;

public class instance1 {
    public static void main(String[] args) {


    //instanceof 연산자 설명

    //오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우는 true

//    new Parent() instanceof Parent // parent가 Parent의 인스턴스를 참조 => true
//    new Child() instanceof Parent // parent가 Child의 인스턴스를 참조 => true

//        new Parent() instanceof Parent;
//        Parent p = new Parent(); //같은 타입 => true
//
//         new Child() instanceof Parent;
//        Parent p = new Parent(); //부모는 자식을 담을 수 있다 => true
//
//         new Parent() instanceof Child;
//        Parent c = new Parent(); //자식은 부모를 담을 수 없다 => false
//
//         new Child() instanceof Child;
//        Parent c = new Child(); //같은 타입 => true
}
}

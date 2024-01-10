package access.a;

public class AccesSData {
    public int publicField;
    int defaultFiled;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicField = " + publicField);
    }
    
    void defaultMethod() {
        System.out.println("publicField = " + publicField);
    }
    
    private void privateMethod(){
        System.out.println("publicField = " + publicField);
    }

    //내부에서는 모두 접근 가능
    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultFiled = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}

package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        //인스턴스에 사용되는 멤버변수 count의 값은 인스턴스끼리 공유되지 않음

        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data1.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data1.count);
    }
}

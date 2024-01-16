package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        //원하는 값을 증가시키려면 카운터 인스턴스를 모두 공유할 수 있음
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }
}

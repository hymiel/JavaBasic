package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println(bigData.count);
        System.out.println(bigData.nullData);


        //NullPointException
        System.out.println(bigData.nullData.value);
    }
}

package ref;

public class NullMain2 {
    public static void main(String[] args) {
        NullData nullData = null;
        nullData.value = 10; // NullPointException 발생
        System.out.println("nullData.value = " + nullData.value);
    }
}

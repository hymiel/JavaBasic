package static2.ex;


public class MathArrayUtils {

    private MathArrayUtils() {
        //인스턴스 생성을 막아버림
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total  += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double)sum(values) / values.length;
    }

    public static int min(int[] values) {
        int minVlalues = values[0];
        for (int value : values) {
            if (value < minVlalues) {
                minVlalues = value;
            }
        }
        return minVlalues;
    }

    public static int max(int[] values) {
        int maxValues = values[0];
        for (int value : values) {
            if (value > maxValues) {
                maxValues = value;
            }
        }
        return maxValues;
    }
}

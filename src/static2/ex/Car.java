package static2.ex;

public class Car {
    private static int totalCars = 0;
    private String carname;


    public Car (String carname) {
        System.out.println("차량 구입, 이름 : " + carname);
        this.carname = carname;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수 : " + totalCars);
    }
}

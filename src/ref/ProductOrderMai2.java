package ref;


import java.util.Scanner;

public class ProductOrderMai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 할 주문의 개수를 입력하세요.");
        int n = scanner.nextInt();
        scanner.nextLine();

        //Class Ex2 리펙토링 (메서드 사용)
        // 상품 주문 시스템 개발
        ProductOrder[] orders = new ProductOrder[n];
        for (int i =0; i < orders.length; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.println("상품명 : ");
            String productName = scanner.nextLine();

            System.out.println(", 상품 가격 : ");
            int price = scanner.nextInt();

            System.out.println(", 상품 수량 : ");
            int quantity = scanner.nextInt();

            scanner.nextLine(); // 입력버퍼 비우기

            orders[i] = creatMenu(productName,price,quantity);

        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);

        System.out.println("총 결제 금액 : " + totalAmount);
    }
    
    static int getTotalAmount(ProductOrder[] productOrder) {
        int totalAmount = 0;
        for (ProductOrder order : productOrder) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
    static void printOrders (ProductOrder[] productOrder) {

        for (ProductOrder p : productOrder) {
            System.out.println("상품명 : " + p.productName + "상품 가격 : " + p.price + "수량 : " + p.quantity);
        }
    }
    static ProductOrder creatMenu(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
}

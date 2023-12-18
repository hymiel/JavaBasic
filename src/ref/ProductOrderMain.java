package ref;


public class ProductOrderMain {
    public static void main(String[] args) {
        //Class Ex2 리펙토링 (메서드 사용)
        // 상품 주문 시스템 개발
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = creatMenu("두부", 2000,2);
        orders[1] = creatMenu("김치", 5000,1);
        orders[2] = creatMenu("콜라",1500,2);

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

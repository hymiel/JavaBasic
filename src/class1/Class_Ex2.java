package class1;

import java.util.Scanner;

public class Class_Ex2 {
    public static void main(String[] args) {
        // 상품 주문 시스템 개발
        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;

        int total = 0;
        ProductOrder[] productOrders = {order1, order2, order3};

        for (ProductOrder p : productOrders) {
            System.out.println("상품명 : " + p.productName + "상품 가격 : " + p.price + "수량 : " + p.quantity);
            total += p.price * p.quantity;
        }

        System.out.println("총 결제 금액 : " + total);

    }
}

package poly.ex.par0;

public class PayMain0 {
    public static void main(String[] args) {

        PayService payService = new PayService();

        //kakao결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //never결제
        String payOption2 = "naver";
        int amount2 = 5000;
        payService.processPay(payOption2, amount2);

        //NewPay결제
        String payOption3 = "new";
        int amount3 = 5000;
        payService.processPay(payOption3, amount3);

        //잘못된 결제 수단 선택
        String payOption4 = "bad";
        int amount4 = 15000;
        payService.processPay(payOption4, amount4);
    }
}

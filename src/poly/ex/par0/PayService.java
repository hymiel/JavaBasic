package poly.ex.par0;

public class PayService {

    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다 : option = " + option + ", amount = " + amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.Pay(amount);
//        if (pay != null) {
//            result = pay.Pay(amount);
//        } DefaultPay 덕분에 null이 없어짐

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

}

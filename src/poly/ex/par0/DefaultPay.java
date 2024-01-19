package poly.ex.par0;

public class DefaultPay implements Pay{
    @Override
    public boolean Pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}

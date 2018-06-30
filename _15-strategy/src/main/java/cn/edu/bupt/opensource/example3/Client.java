package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:55</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        PaymentStrategy strategyRMB = new PaymentCashRMB();
        PaymentStrategy strategyDollor = new PaymentCashDollar();
        new PaymentContext("孙中山", 1000, strategyRMB).payNow();
        new PaymentContext("华盛顿", 1000, strategyDollor).payNow();
        // 添加新的支付方式
        PaymentStrategy strategyCard = new PaymentCard();
        new PaymentContextNew("孟德斯鸠", 1000, "13203534868954675076756", strategyCard).payNow();
    }

}

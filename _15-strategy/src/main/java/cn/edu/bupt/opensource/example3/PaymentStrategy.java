package cn.edu.bupt.opensource.example3;
/**
 * <p>Title: PaymentStrategy</p>
 * <p>Description: 工资支付的策略接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:46</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface PaymentStrategy {

    /**
     * 工资支付
     * @param context   上下文对象
     */
    void pay(PaymentContext context);

}

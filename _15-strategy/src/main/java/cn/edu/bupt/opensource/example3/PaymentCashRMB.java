package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: PaymentCashRMB</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:48</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class PaymentCashRMB implements PaymentStrategy {

    @Override
    public void pay(PaymentContext context) {
        System.out.println("现在给员工" + context.getUsername() + "，使用人民币支付工资：" + context.getSalary() + "元。");
    }

}

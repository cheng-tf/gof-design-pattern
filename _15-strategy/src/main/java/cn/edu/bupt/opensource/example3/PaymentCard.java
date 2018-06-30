package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: PaymentCard</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:57</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class PaymentCard implements PaymentStrategy {

    @Override
    public void pay(PaymentContext context) {
        PaymentContextNew contextNew = (PaymentContextNew) context;
        System.out.println("现在给员工" + contextNew.getUsername() + "的银行卡："
                + contextNew.getAccount() + "转账" + contextNew.getSalary() + "元。");
    }

}

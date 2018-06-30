package cn.edu.bupt.opensource.example3;
/**
 * <p>Title: PaymentContextNew</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 12:00</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class PaymentContextNew extends PaymentContext {


    // 银行账号
    private String account = null;

    public PaymentContextNew(String username, double salary, String account, PaymentStrategy paymentStrategy) {
        super(username, salary, paymentStrategy);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}

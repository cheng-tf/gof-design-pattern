package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: PaymentContext</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:48</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class PaymentContext {

    // 员工姓名
    private String username = null;

    // 工资
    private double salary = 0.0;

    // 工资支付策略
    private PaymentStrategy paymentStrategy;

    public PaymentContext(String username, double salary, PaymentStrategy paymentStrategy) {
        this.username = username;
        this.salary = salary;
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * 支付工资
     */
    public void payNow() {
        paymentStrategy.pay(this);
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }






}

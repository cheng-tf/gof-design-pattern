package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: PayModel</p>
 * <p>Description: 工资模型对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 17:49</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class PayModel {

    // 姓名
    private String username;

    // 工资
    private int pay;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "PayModel{" +
                "username='" + username + '\'' +
                ", pay=" + pay +
                '}';
    }
}

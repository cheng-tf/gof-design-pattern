package cn.edu.bupt.opensource.example4;

/**
 * <p>Title: Order</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 10:37</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Order implements OrderApi {

    // 产品名称
    private String productName;

    // 订单的订购数量
    private int orderNum;

    // 操作人员
    private String user;

    public Order(String productName, int orderNum, String user) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.user = user;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName, String user) {
        this.productName = productName;
    }

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;
    }

    @Override
    public String getUser() {
        return user;
    }

    @Override
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", orderNum=" + orderNum +
                ", user='" + user + '\'' +
                '}';
    }
}

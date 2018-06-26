package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: OrderPersonal</p>
 * <p>Description: 个人订单 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 15:50</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class OrderPersonal implements Order {

    // 订购人姓名
    private String customerName;

    // 产品编号
    private String productId;

    // 订单中的产品数量
    private int orderProductNum = 0;

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "个人订单 OrderPersonal{" +
                "customerName='" + customerName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }
}

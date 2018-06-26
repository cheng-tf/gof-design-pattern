package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: OrderEnterprise</p>
 * <p>Description: 公司订单 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 15:53</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class OrderEnterprise implements Order {

    // 企业姓名
    private String enterpriseName;

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

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "企业订单 OrderEnterprise{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }
}

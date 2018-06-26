package cn.edu.bupt.opensource.example4;

/**
 * <p>Title: Order</p>
 * <p>Description: 订单接口（使用原型模式） </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 15:48</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface Order {

    /**
     * 获取订单中的产品数量
     */
    int getOrderProductNum();

    /**
     * 设置订单中的产品数量
     */
    void setOrderProductNum(int num);


}

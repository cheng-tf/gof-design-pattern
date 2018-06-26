package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Business</p>
 * <p>Description: 订单处理业务 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 15:56</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Business {

    /**
     * 创建订单
     */
    public void saveOrder(Order order) {
        while(order.getOrderProductNum() > 1000) {
            // 使用原型模式
            Order newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(1000);
            order.setOrderProductNum(order.getOrderProductNum() - 1000);
            System.out.println("拆分生成订单：" + newOrder);
        }
        System.out.println("订单：" + order);
    }

}

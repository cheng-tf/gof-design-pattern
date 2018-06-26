package cn.edu.bupt.opensource.example2;

import com.sun.org.apache.xpath.internal.operations.Or;

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
            Order newOrder = null;
            if(order instanceof OrderPersonal) {
                OrderPersonal p1 = (OrderPersonal) order;
                OrderPersonal p2 = new OrderPersonal();
                p2.setCustomerName(p1.getCustomerName());
                p2.setProductId(p1.getProductId());
                p2.setOrderProductNum(1000);
                newOrder = p2;
            } else if(order instanceof OrderEnterprise) {
                OrderEnterprise e1 = (OrderEnterprise) order;
                OrderEnterprise e2 = new OrderEnterprise();
                e2.setEnterpriseName(e1.getEnterpriseName());
                e2.setProductId(e1.getProductId());
                e2.setOrderProductNum(1000);
                newOrder = e2;
            }
            order.setOrderProductNum(order.getOrderProductNum() - 1000);
            System.out.println("拆分生成订单：" + newOrder);
        }
        System.out.println("订单：" + order);
    }

}

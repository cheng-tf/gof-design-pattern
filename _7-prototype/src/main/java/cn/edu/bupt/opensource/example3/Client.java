package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 16:04</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        OrderPersonal personal = new OrderPersonal();
        personal.setCustomerName("六四");
        personal.setProductId("P0001");
        personal.setOrderProductNum(2590);

        new Business().saveOrder(personal);
    }

}

package cn.edu.bupt.opensource.example4;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 10:51</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Order order = new Order("《设计模式》", 100, "张三");

        DynamicProxy proxy = new DynamicProxy();
        OrderApi orderApi = proxy.getProxyInterface(order);

        orderApi.setOrderNum(123, "李四");
        System.out.println("李四修改后：" + orderApi);

        orderApi.setOrderNum(123, "张三");
        System.out.println("张三修改后：" + orderApi);

    }

}

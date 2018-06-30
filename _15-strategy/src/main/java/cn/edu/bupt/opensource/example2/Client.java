package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:33</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 创建策略对象
        Strategy strategy = new StrategyCustomerOld();
        // #2 创建上下文对象
        Price price = new Price(strategy);
        System.out.println("向客户报价：" + price.quote(1000));
    }


}

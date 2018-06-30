package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: StrategyCustomerLarge</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:23</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class StrategyCustomerLarge implements Strategy {

    @Override
    public double calPrice(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%。");
        return goodsPrice * (1 - 0.1);
    }

}

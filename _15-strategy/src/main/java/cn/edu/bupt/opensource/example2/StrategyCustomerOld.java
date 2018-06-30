package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: StrategyCustomerOld</p>
 * <p>Description: 老客户 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:22</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class StrategyCustomerOld implements Strategy {

    @Override
    public double calPrice(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%。");
        return goodsPrice * (1 - 0.05);
    }

}

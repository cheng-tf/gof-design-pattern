package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: StrategyCustomerNormal</p>
 * <p>Description: 普通客户或新客户 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:21</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class StrategyCustomerNormal implements Strategy {

    @Override
    public double calPrice(double goodsPrice) {
        System.out.println("对于普通客户或新客户，没有折扣。");
        return goodsPrice;
    }

}

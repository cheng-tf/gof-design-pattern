package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Price</p>
 * <p>Description: 价格管理(上下文对象) </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:24</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Price {

    // 报价策略
    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 客户报价
     */
    public double quote(double goodsPrice) {
        return strategy.calPrice(goodsPrice);
    }

}

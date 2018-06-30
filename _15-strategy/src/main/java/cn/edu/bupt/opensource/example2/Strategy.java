package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Strategy</p>
 * <p>Description: 策略，定义报价算法的接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 11:19</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface Strategy {

    /**
     * 计算实际报价
     */
    double calPrice(double goodsPrice);

}

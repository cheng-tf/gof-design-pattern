package cn.edu.bupt.opensource.example2;

import java.util.Date;

/**
 * <p>Title: DecoratorSumPrize</p>
 * <p>Description: 累计奖金 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 21:17</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class DecoratorSumPrize extends Decorator {

    public DecoratorSumPrize(Component component) {
        super(component);
    }

    /**
     * 计算奖金
     */
    public double calPrize(String user, Date begin, Date end) {
        // #1 首先获取之前计算的奖金
        double money = super.calPrize(user, begin, end);
        // #2 计算当前业务奖金
        double prize = 1000000 * 0.001;
        System.out.println(user + "的累计奖金为：" + prize);
        return money + prize;
    }

}

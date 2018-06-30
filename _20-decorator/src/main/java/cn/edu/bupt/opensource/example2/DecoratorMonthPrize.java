package cn.edu.bupt.opensource.example2;

import java.util.Date;

/**
 * <p>Title: DecoratorMonthPrize</p>
 * <p>Description: 当月业务奖金 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 21:13</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class DecoratorMonthPrize extends Decorator {

    public DecoratorMonthPrize(Component component) {
        super(component);
    }

    /**
     * 计算奖金
     */
    public double calPrize(String user, Date begin, Date end) {
        // #1 首先获取之前计算的奖金
        double money = super.calPrize(user, begin, end);
        // #2 计算当前业务奖金
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user + "的当月业务奖金为：" + prize);
        return money + prize;
    }

}

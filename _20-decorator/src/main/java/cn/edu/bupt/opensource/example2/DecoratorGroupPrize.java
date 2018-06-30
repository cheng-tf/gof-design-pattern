package cn.edu.bupt.opensource.example2;

import java.util.Date;

/**
 * <p>Title: DecoratorGroupPrize</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 21:19</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class DecoratorGroupPrize extends Decorator {

    public DecoratorGroupPrize(Component component) {
        super(component);
    }

    /**
     * 计算奖金
     */
    public double calPrize(String user, Date begin, Date end) {
        // #1 首先获取之前计算的奖金
        double money = super.calPrize(user, begin, end);
        // #2 计算当前业务奖金
        double group = 0.0;
        for(double saleMoney : TempDB.mapMonthSaleMoney.values()) {
            group += saleMoney;
        }
        double prize = group * 0.01;
        System.out.println(user + "的当月团队业务奖金为：" + prize);
        return money + prize;
    }
}

package cn.edu.bupt.opensource.example2;

import java.util.Date;

/**
 * <p>Title: Component</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 21:06</p>
 * @author ChengTengfei
 * @version 1.0
 */
public abstract class Component {

    /**
     * 计算奖金
     * @param user  员工
     * @param begin 开始时间
     * @param end   结束时间
     * @return      奖金
     */
    public abstract double calPrize(String user, Date begin, Date end);

}

package cn.edu.bupt.opensource.example2;

import java.util.Date;

/**
 * <p>Title: Decorator</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 21:10</p>
 * @author ChengTengfei
 * @version 1.0
 */
public abstract class Decorator extends Component {

    // 组件对象
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 计算奖金
     */
    public double calPrize(String user, Date begin, Date end) {
        // 转调
        return component.calPrize(user, begin, end);
    }

}

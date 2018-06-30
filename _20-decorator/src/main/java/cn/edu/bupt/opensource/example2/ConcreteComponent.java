package cn.edu.bupt.opensource.example2;

import java.util.Date;

/**
 * <p>Title: ConcreteComponent</p>
 * <p>Description: 计算奖金的基本实现 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 21:08</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteComponent extends Component {

    @Override
    public double calPrize(String user, Date begin, Date end) {
        // 默认奖金为0
        return 0;
    }

}

package cn.edu.bupt.opensource.example2;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: TempDB</p>
 * <p>Description: 模拟数据库 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 20:54</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class TempDB {

    // 月销售额
    public static Map<String, Double> mapMonthSaleMoney = new HashMap<>();

    static {
        // 测试数据
        mapMonthSaleMoney.put("孙中山", 10000.0);
        mapMonthSaleMoney.put("华盛顿", 20000.0);
        mapMonthSaleMoney.put("卢梭", 30000.0);
    }



}

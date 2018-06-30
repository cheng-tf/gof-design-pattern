package cn.edu.bupt.opensource.example;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: FlyweightFactory</p>
 * <p>Description: 享元工厂 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 15:53</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class FlyweightFactory {

    // 缓存多个享元对象
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    /**
     * 获取享元对象
     */
    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweightMap.get(key);
        if(flyweight == null) {
            flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key ,flyweight);
        }
        return flyweight;
    }

}

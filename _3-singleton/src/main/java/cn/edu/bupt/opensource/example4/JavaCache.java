package cn.edu.bupt.opensource.example4;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: JavaCache</p>
 * <p>Description: Java缓存的基本实现 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 15:52</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class JavaCache {

    /**
     * 定义缓存数据的容器，一般使用Map，可直接使用Key获取Vale
     */
    private Map<String, Object> map = new HashMap<>();

    /**
     * 从缓存中获取值
     * @param key   键
     * @return      值
     */
    public Object getObject(String key) {
        // #1 从缓存中获取值
        Object obj = map.get(key);
        // #2 判断缓存中是否有值
        if(obj == null) {
            // #3 若没有，则从数据库或文件中获取相应数据
            // #4 将数据设置到缓存中
            map.put(key, key + ",value");
        }
        // #5 返回
        return obj;
    }

}

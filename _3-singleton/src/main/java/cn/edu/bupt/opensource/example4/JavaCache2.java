package cn.edu.bupt.opensource.example4;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: JavaCache2</p>
 * <p>Description: 使用缓存实现单例模式 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 16:00</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class JavaCache2 {

    private JavaCache2() {
    }

    /**
     * 定义一个缺省的key
     */
    private final static String DEFAULT_KEY = "One";

    /**
     * 定义缓存数据的容器，一般使用Map，可直接使用Key获取Vale
     */
    private static Map<String, JavaCache2> map = new HashMap<>();

    /**
     * 从缓存中获取值
     */
    public static JavaCache2 getInstance() {
        JavaCache2 instance = (JavaCache2) map.get(DEFAULT_KEY);
        if(instance == null) {
            instance = new JavaCache2();
            map.put(DEFAULT_KEY, instance);
        }
        return instance;
    }



}

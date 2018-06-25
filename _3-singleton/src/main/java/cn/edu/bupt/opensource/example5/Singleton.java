package cn.edu.bupt.opensource.example5;

/**
 * <p>Title: Singleton</p>
 * <p>Description: 单例模式 懒汉式（DCL：双重检查加锁） </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 14:26</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Singleton {

    private Singleton() {
    }

    private volatile static Singleton uniqueInstance = null;

    public static Singleton getInstance() {
        // 检查实例是否存在
        if(uniqueInstance == null) {
            // 同步块
            synchronized (Singleton.class) {
                // 再次检查实例是否存在
                if(uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}

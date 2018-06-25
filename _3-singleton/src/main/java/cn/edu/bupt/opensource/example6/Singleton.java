package cn.edu.bupt.opensource.example6;

/**
 * <p>Title: Singleton</p>
 * <p>Description:  Lazy initialization holder class模式 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 14:26</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {

        /**
         * 静态化初始器，由JVM保证线程安全
         */
        private static Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.uniqueInstance;
    }

}

package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Singleton2</p>
 * <p>Description: 单例模式 饿汉式：以空间换时间，线程安全（由虚拟机保证） </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 14:36</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Singleton2 {

    /**
     * #1 私有化构造方法，便于在内部控制创建实例的数目
     */
    private Singleton2() {
    }

    /**
     * #4 定义一个变量用于存储创建好的类实例：直接创建类实例，由虚拟机保证只会创建一次
     */
    private static Singleton2 uniqueInstance = new Singleton2();

    /**
     * #2 定义一个方法为客户端提供类实例
     * #3 定义为类方法，添加static关键字
     */
    public static Singleton2 getInstance() {
        // #5 直接使用已创建的实例
        return uniqueInstance;
    }


    private String singletonData;

    public String getSingletonData() {
        return singletonData;
    }

    public void singletonOperation() {
    }

}

package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Singleton</p>
 * <p>Description: 单例模式 懒汉式（延迟加载） </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 14:26</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 单例模式
 *  定义：在运行时，保证一个类仅有一个实例对象，并提供一个访问它的全局访问点。
 *  角色：
 *      1）Singleton：负责创建Singleton类自己的唯一实例，并提供一个getInstance的方法，用于外部访问此类的唯一实例。
 *  举例：读取配置文件
 *  功能：用于保证这个类在运行期间只会创建一个类实例，并提供一个全局唯一访问这个类实例的访问点。
 *  范围：一个ClassLoader及其子ClassLoader的范围
 *  命名：一般单例模式的方法命名为：getInstance()
 *  分类：
 *      1）懒汉式：以时间换空间，不加同步锁是线程不安全的；
 *      2）饿汉式：以空间换时间，线程安全（由虚拟机保证只会装载一次）。
 *  懒汉式思想：
 *      1）延迟加载（Lazy Load）：开始不加载资源或数据，一直到必须使用才加载，用于尽可能地节省资源。
 *      2）缓存：若某些资源或数据频繁使用，每次操作时，首先从内存中获取，是一种典型的以空间换时间的思想。
 *  理解：
 *      1）懒汉式是典型的时间换空间，饿汉式是典型的空间换时间。
 *      2）线程安全性
 *          A.不加同步锁的懒汉式是线程不安全的；
 *          B.饿汉式是线程安全的，由虚拟机保证只会装载一次。
 *          C.双重检查加锁（DCL）：
 *              并不是每次进入getInstance()都需要加锁，而是先不同步，进入方法后：
 *              先检查实例是否存在，若不存在才进入同步块，即第一重检查；
 *              进入同步块后，再次检查实例是否存在，若不存在则在同步锁下创建一个实例，即第二次检查。
 *              从而，只需要同步一次，减少了多次同步所浪费的时间。
 *
 *              使用volatile关键字。
 *              被volatile修饰的变量，不会被本地线程缓存，而对该变量的读写都是直接操作共享内存，保证此实例变量的可见性。
 *      3）Lazy initialization holder class方式
 *          综合内部类、及多线程缺省同步锁，同时实现了延迟加载、线程安全。
 *      4）枚举方式
 *          单元素的枚举类型已经成为实现单例模式的最佳方法！！！
 *  本质：控制实例数目
 *  使用场景：
 *      1）希望控制一个类的实例只有一个，且客户端只能从一个全局访问点访问，考虑单例模式。
 */
public class Singleton {

    /**
     * #1 私有化构造方法，便于在内部控制创建实例的数目
     */
    private Singleton() {
    }

    /**
     * #4 定义一个变量用于存储创建好的类实例
     * #5 添加static修饰符
     */
    private static Singleton uniqueInstance = null;

    /**
     * #2 定义一个方法为客户端提供类实例
     * #3 定义为类方法，添加static关键字
     */
    public static synchronized Singleton getInstance() {
        // #6 判断存储类实例的变量是否有值
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }


    private String singletonData;

    public String getSingletonData() {
        return singletonData;
    }

    public void singletonOperation() {
    }
}

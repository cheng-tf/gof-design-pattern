package cn.edu.bupt.opensource.example7;

/**
 * <p>Title: Singleton</p>
 * <p>Description: 使用枚举实现单例模式 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 16:27</p>
 * @author ChengTengfei
 * @version 1.0
 */
public enum Singleton {

    /**
     * 定义一个枚举的元素，即代表了Singleton的一个实例
     */
    uniqueInstance;


    // 示意方法
    public void singletonoperation() {
        // 功能处理
        System.out.println("-----测试-------：" + Singleton.uniqueInstance.hashCode());
    }

}

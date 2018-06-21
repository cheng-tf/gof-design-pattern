package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Factory</p>
 * <p>Description: 工厂类，负责创建Api对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-21 21:36</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 简单工厂模式
 *  定义：提供创建对象实例的功能，而无需关心其具体实现；而被创建实例的类型可以是接口、抽象类、具体类
 *  体会：封装隔离
 *
 */
public class Factory {

    /**
     * 创建具体的Api对象
     * @param condition 外部传入的选择条件
     * @return          已创建完成的Api对象
     */
    public static Api createApi(int condition) {
        // 根据条件选择创建哪一个具体的实现对象，可从外部传入或其他途径获取
        // 若仅有一个实现，则可省略条件
        if(condition == 1) {
            return new ApiImpl1();
        } else if(condition == 2) {
            return new ApiImpl2();
        }
        return null;
    }

}

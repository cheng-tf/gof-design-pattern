package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteCreator</p>
 * <p>Description: 具体的创建器实现对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 16:53</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteCreator extends Creator{

    /**
     * 重定义工厂方法，返回一个具体的Product对象
     */
    @Override
    protected Product factoryMethod() {
        return new ProductImpl();
    }

}

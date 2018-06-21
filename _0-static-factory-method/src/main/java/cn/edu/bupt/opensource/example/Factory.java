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
 *  名称：也称为静态工厂方法模式，“万能工厂”
 *  定义：提供创建对象实例的功能，而无需关心其具体实现；而被创建实例的类型可以是接口、抽象类、具体类
 *  体会：封装隔离
 *  不使用模式：使用使用new直接创建Api接口的对象实例，但不能实现真正的接口编程！
 *  典型疑问：理解简单工厂类的位置
 *  命名：类名建议为“模块名+Factory”，方法名建议为“get+接口名”或“create+接口名”
 *  注意：若客户端在调用工厂时，传入选择的参数，则客户端必须了解参数含义，从而要求工厂暴露一定的内部实现细节。
 *  可配置的简单工厂：基于反射、配置文件
 *  优点：帮助封装，解耦
 *  缺点：可能增加客户端的复杂度，不方便扩展子工厂
 *  本质：“选择实现”
 *  适用场景：
 *      1）需要完全封装隔离具体实现，让外部只能通过接口来操作封装体；
 *      2）需要将对外创建对象的职责集中管理与控制；
 */
public class Factory {

    private Factory(){
    }

    /**
     * 选择合适的实现类，创建Api实例对象
     * @param condition 外部传入的选择条件
     * @return          已创建完成的Api对象
     */
    public static Api createApi(int condition) {
        // 根据条件参数选择创建哪一个具体的实现对象，可从外部传入、配置文件、或系统自身获取
        // 若仅有一个实现，则可省略条件参数
        if(condition == 1) {
            return new ApiImpl1();
        } else if(condition == 2) {
            return new ApiImpl2();
        }
        return null;
    }

}

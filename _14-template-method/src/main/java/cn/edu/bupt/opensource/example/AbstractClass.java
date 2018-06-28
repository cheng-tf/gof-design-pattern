package cn.edu.bupt.opensource.example;
/**
 * <p>Title: AbstractClass</p>
 * <p>Description: 抽象类 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 18:06</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 模板方法模式
 *  定义：定义一个操作中算法的骨架，而将一些步骤延迟到子类中，使子类可重定义算法的某些特定步骤，而不改变该算法的结构。
 *  角色：
 *      1）AbstractClass：抽象类，定义算法骨架和原语操作，且可提供算法中通用的实现。
 *      2）ConcreteClass：具体实现类，用于实现算法骨架中的某些步骤。
 *  举例：登录控制
 *      1）普通用户、工作用户(密码需要加密)
 *      2）使用模板方法模式
 *  认识：
 *      1）功能：模板方法用于固定算法骨架，而让具体算法实现可扩展；还可以控制子类的扩展。例如：DAO中通用的增删改查
 *      2）为什么不是接口？
 *          既要约束子类的行为，同时为子类提供公共功能。--->抽象类
 *      3）变与不变
 *      4）好莱坞法则：“不要找我们，我们会联系你”即作为弗雷德末班，在需要时会调用子类的相应方法。
 *         理论依据：Java动态绑定中所采用的“后期绑定”技术。
 *      5）模板的写法：
 *          A.模板方法：定义算法骨架的方法
 *          B.具体操作：在模板中直接实现某些步骤的方法，通常固定不变，作为公共功能；若子类需要访问，则定义为protected final。
 *          C.具体的AbstractClass操作：仅是辅助的公共功能
 *          D.原语操作：模板中定义的抽象操作，通常在模板方法中调用，由子类具体实现。
 *          E.钩子操作：模板中定义、并提供默认实现的操作；通常一定是模板方法中的步骤。
 *          F.工厂方法：可结合工厂方法模式获取实例。
 *      6）Java回调与模板方法模式
 *          A.Java回调技术：本质是Java的动态绑定技术，可使用匿名内部类实现。
 *          B.回调机制更加灵活，基于接口；而继承只能单继承。
 *          C.回调机制实际是采用委托的方式组合功能，耦合性更低。
 *      7）典型应用：列表排序
 *          A.java.util.Collections类：静态的sort()方法，入参是集合、Comparator接口(回调)的实例。
 *  举例：实现通用的增删改查
 *  优点：
 *      1）代码复用
 *  缺点：
 *      1）算法骨架难以升级
 *  本质：固定算法骨架
 *  设计原则：
 *      1）开闭原则
 *      2）里氏替换原则
 *  适用场景：
 *      1）若需要一次性实现算法的不变部分，并将可变行为留给子类来实现，可考虑。
 *
 */
public abstract class AbstractClass {

    /**
     * 原语操作1
     */
    public abstract void doPrimitiveOperation1();

    /**
     * 原语操作2
     */
    public abstract void doPrimitiveOperation2();

    /**
     * 模板方法，定义算法骨架
     */
    public final void templateMethod() {
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }

}

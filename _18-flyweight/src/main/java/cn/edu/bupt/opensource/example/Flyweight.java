package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Flyweight</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 15:43</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 享元模式
 *  定义：运用共享技术，有效地支持大量细粒度的对象。
 *  角色：
 *      1）Flyweight：享元接口，可接受、作用于外部数据。
 *      2）ConcreteFlyweight：具体的享元实现，可共享。
 *      3）UnsharedConcreteFlyweight：不可共享的享元实现，通常是对共享享元对象的组合对象。
 *      4）FlyweightFactory：享元工厂，创建、管理共享的襄垣对象，并提供对外访问的接口。
 *      5）Client：客户端，维持一个对flyweight的引用，计算或存储享元对象的外部状态。
 *  举例：权限控制
 *  认识：
 *      1）变与不变：此模式的重点在于分离变与不变。
 *          A.状态分为内部状态(不变)、外部状态(可变)；其中共享不变的部分，可减少对象数量、节约内存。
 *      2）共享与不共享：通常共享的是叶子对象。
 *      3）内部状态与外部状态
 *          A.内部状态：包含在享元对象内部、本身的数据，通常是独立于使用享元的场景的信息。
 *      4）实例池：缓存享元对象
 *      5）谁来初始化共享对象？    第一次向享元工厂获取享元对象时创建。
 *      6）不需要共享的享元实现
 *          A.多出现于组合结构中--->复合享元
 *      7）对享元对象的管理
 *          A.引用计数
 *          B.垃圾回收
 *  优点：
 *      1）减少对象数量，节省内存空间
 *  缺点：
 *      1）维护共享对象，需要额外开销
 *  本质：分离与共享
 *
 */
public interface Flyweight {

    /**
     * 传入外部状态
     */
    void operation(String extraState);

}

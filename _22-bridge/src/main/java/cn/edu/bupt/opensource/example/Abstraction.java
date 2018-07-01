package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Abstraction</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 11:39</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 桥接模式
 *  定义：将抽象部分与它的实现部分分离，使它可以独立的变更。
 *  角色：
 *      1）Abstraction：抽象层接口，通常维护实现层的对象
 *      2）RefinedAbstraction：扩展抽象层的接口，定义了基于Implementor基本操作的业务方法。
 *      3）Implementor：实现层接口，定义了基本操作。
 *      4）ConcreteImplementor：真正实现Implementor接口的对象。
 *  举例：发送提示消息
 *      1）需求：
 *          A.抽象的消息：普通、加急、特急等。
 *          B.具体的消息发送方式：系统内短信息、邮件等。
 *      2）使用桥接模式：客户端只需要关注发送消息，不再关心具体如何发送。
 *  认识：
 *      1）什么是桥接？    给被分离的抽象层、实现层搭桥
 *      2）为何需要搭桥？
 *      3）如何桥接？     在抽象层中维护实现层的对象，即可实现。
 *      4）独立变化
 *      5）动态变换功能
 *      6）退化的桥接模式：仅有一个Implementor实现，但仍分离，便于扩展。
 *      7）桥接模式与继承
 *          A.桥接模式的变化时多个维度，即把继承改成了对象组合；而继承是单维度的。
 *      8）谁来桥接？
 *          A.客户端负责桥接：先创建Implementor对象，在设置到Abstraction抽象层中。
 *          B.抽象部分负责桥接
 *          C.抽象工厂/简单工厂负责桥接
 *          D.IoC/DI容器负责桥接
 *  Java中的典型应用：JDBC
 *      1）JDBC开发：
 *          A.面向其API(由DriverManager获得)开发，即这些接口相当于桥接模式的抽象层接口。
 *          B.JDBC的驱动程序相当于桥接模式中的具体实现层。
 *          C.DriverManager负责桥接，类似于简单工厂。
 *  广义桥接：Java中无处不桥接
 *      1）面向抽象编程
 *      2）去除RefinedAbstraction的桥接模式
 *  优点：
 *      1）分离抽象部分、实现部分
 *      2）扩展性好
 *      3）动态切换实现
 *      4）相对于继承，减少子类的个数
 *  本质：分离抽象与实现
 *  设计原则：
 *      1）开闭原则
 *      2）多用对象组合，少用继承
 *
 */
public abstract class Abstraction {

    // 实现层
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }


    public void operation() {
        implementor.operation();
    }


}

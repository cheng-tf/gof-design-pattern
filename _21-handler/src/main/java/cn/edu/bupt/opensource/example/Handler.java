package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Handler</p>
 * <p>Description: 职责接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 21:50</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 责任链模式
 *  定义：使多个对象都有机会处理请求，从而避免请求的发送者与接受者之间的耦合关系。
 *      将这个对象连成一条链传递该请求，直到有一个对象处理它为止。
 *  角色：
 *      1）Handler：职责接口，通常用于定义处理请求的方法。
 *      2）ConcreteHandler：职责的具体实现类，实现对职责范围内请求的处理；若不处理，则转发给后继者。
 *      3）Client：客户端，组装责任链，并 向链上提交请求。
 *  举例：申请聚餐费用
 *  认识：
 *      1）功能：请求者与接收者解耦
 *      2）隐式接收者：对于客户端，并不知道最终的处理对象。
 *      3）如何构建链？
 *          A.在客户端，即在提交请求前组合链，称为外部链；
 *          B.在Handler，称为内部连
 *          C.在具体的职责对象中构建实现
 *      4）谁来处理？ 运行时动态决定
 *      5）请求一定会被处理吗？    可在责任链末端增加一个不支持此功能处理的职责对象，进行提示
 *      6）处理多种请求
 *          A.简单的处理方式：定义不同的业务方法
 *          B.通用请求的处理方式：可定义一种通用的调用框架
 *      7）功能链：责任链的变形
 *          A.每个职责对象负责处理请求的某一部分功能，处理完成后，不会停止，而是继续向下传递。
 *          B.举例：权限检查
 *          B.WEB开发中的Filter：过滤器链类似于功能链。
 *  优点：
 *      1）请求者与接收者松散耦合
 *      2）动态组合职责
 *  缺点：
 *      1）产生很多细粒度对象
 *      2）不一定被处理
 *  本质：分离职责，动态组合
 *
 */
public abstract class Handler {

    // 后继职责对象
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求
     */
    public abstract void handleRequest();

}

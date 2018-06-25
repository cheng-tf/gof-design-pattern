package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Adapter</p>
 * <p>Description: 适配器 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 23:19</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 适配器模式
 *  定义：将一个类的接口转化为客户所希望的另一个接口，使得接口不兼容的类可一起工作。
 *  角色：
 *      1）Client：客户端，调用所需的领域接口Target
 *      2）Target：定义客户端所需要的与特定领域相关的接口
 *      3）Adaptee：已存在的接口，但是与客户端要求的特定领域不一致，需要被适配
 *      4）Adapter：适配器，基于对象组合的思想，将Adaptee适配成为Client需要的Target
 *  生活中的示例：装配电脑
 *      1）旧的硬盘与电源--->2）加入新的硬盘--->3）使用转接线（类似于适配器类）
 *  举例：日志管理
 *      1）v1.0：要求日志以文件形式存储
 *      2）v2.0：采用数据库管理日志
 *  认识：
 *      1）“转换匹配”，复用已有的功能，而不是实现新的接口（若实现，称为智能适配器）。
 *      2）Adaptee与Target：无关联
 *      3）适配器的实现方式：对象组合
 *  理解：
 *      1）Adapter的常见实现：Adapter通常是一个类，一般用于实现Target接口，然后在实现里调用Adaptee。
 *      2）智能适配器：Adapter加入新功能的实现
 *      3）适配多个Adaptee
 *      4）Adapter实现的复杂程度：取决于Adaptee与Target的相似程度。
 *      5）缺省适配：为一个接口提供缺省实现。
 *  适配器：
 *      1）双向适配器：实现双向的适配，即此Adapter可同时作为Adaptee或Target使用。
 *      2）对象适配器：依赖于对象组合，是动态的。
 *      3）类适配器：采用多重继承对一个接口与另一个接口进行适配，但Java不支持！！！
 *                  Java中采用继承+实现可类似于类适配器，可重新定义Adaptee的部分行为。
 *  优点：
 *      1）复用性好
 *      2）可扩展性好
 *  缺点：
 *      1）若过度使用，使得系统非常凌乱，不容易整体进行把握。
 *  本质：转换匹配，复用功能
 *  使用场景：
 *      1）若希望使用一个已存在的类，但接口不符合需求，可考虑适配器模式。
 *      2）若希望创建一个可复用的类，但可能与不兼容的类一起工作，可考虑适配器模式。
 *      3）若希望使用一些已存在的子类，不能适配每一个子类，直接适配父类即可。
 */
public class Adapter implements Target{

    // 持有需要被适配的接口对象
    private Adaptee adaptee;

    // 构造方法：传入需要被适配的对象
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // 转调
        adaptee.specificRequest();
    }

}

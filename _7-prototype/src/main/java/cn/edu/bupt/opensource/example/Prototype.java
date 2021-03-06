package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Prototype</p>
 * <p>Description: 一个克隆自身的接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 15:31</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 原型模式
 *  定义：用原型实例指定创建对象的类型，并通过拷贝这些原型，以创建新的对象。
 *  角色：
 *      1）Prototype：声明一个克隆自身的接口。
 *      2）ConcretePrototype：Prototype接口的实现，用于真正实现克隆自身的功能。
 *      3）Client：使用原型的客户端，首先获取原型实例对象，然后通过此实例克隆自身来创建新的对象实例。
 *  举例：订单处理系统
 *      1）客户需求：当订单的预定产品数量超过1000，则需要拆分为多份订单保存，便于后续的人工处理。
 *      2）订单类型：个人/公司订单，需要设计通用的处理系统。
 *      3）不使用模式
 *          由于instanceof的使用，依然关心订单类型与具体实现；而且难以扩展新的订单类型。
 *      4）使用原型模式
 *  认识：
 *      1）功能：A.通过克隆创建新的对象实例
 *               B.为此新实例复制原型实例的属性值，一般新实例的数据与原型实例相同。
 *      2）原型与new：类似于new，但原型克隆出的对象实例的属性具有值。
 *      3）克隆实例与原型实例：克隆完成后，无任何关联。
 *  Java中的克隆方法
 *      1）克隆：实现java.lang.Cloneable标识接口即可。Object类中的clone()提供了克隆功能。
 *      2）浅度克隆：只负责克隆按值传递的数据，如基本数据类型、String类型；
 *      3）深度克隆：除浅度克隆外，还负责克隆引用类型的数据，即所有的数据均可克隆出来。
 *          注意：深度克隆所涉及的全部对象，都需要正确实现克隆方法；否则失败！
 *  原型管理器
 *      1）简介：即系统中所维护的当前可用的原型的注册表，用于管理系统中的原型(记录创建与销毁)。
 *      2）理解：相当于缓存资源的实现，资源为原型实例。
 *  优点：
 *      1）对于客户端，隐藏具体的实现类型
 *      2）在运行时，动态地改变具体的实现类型
 *  缺点：
 *      1）深度克隆方法的实现比较困难
 *  本质：克隆生成对象
 *  适用场景：
 *      1）若系统希望独立于其想使用的对象，可考虑。
 *      2）若需要的类在运行时动态指定，可考虑。
 *
 */
public interface Prototype {

    /**
     * 克隆自身的方法
     */
    Prototype clone();

}

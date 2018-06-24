package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Facade</p>
 * <p>Description: 外观对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-21 22:43</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 外观模式（门面模式）
 *  定义：为子系统的一组接口提供一个一致的界面，即定义了一个高层接口，使得子系统更容易使用。
 *  理解：
 *      1）隐藏了系统的复杂性，并向客户端提供了一个可以访问系统的接口，属于结构性模式。
 *      2）为子系统中的一组接口提供了一个统一的访问接口。
 *  角色：
 *      1）门面：外观模式的核心，定义子系统的多个模块对外的高层接口，通常需要调用多个内部模块，从而将客户的请求代理给适当的子系统对象。
 *      2）模块：接收Facade的委派，真正实现功能，各模块之间可能存在交互。
 *      3）客户端：通过调用Facade完成功能实现
 *      注意：Facade已知所有模块，但模块不应该已知Facade的存在。
 *  生活中的示例：组装电脑
 *      1）完全自己组装
 *      2）寻找专业装机公司组装
 *  目的：并非给子系统添加新的功能接口，而是为了减少外部与子系统内模块的交互，松散耦合，简化使用。
 *  理解：
 *      1）Facade方便客户端的调用，封装了系统内部的细节功能，实现功能的共享与复用。
 *      2）外观提供了缺省的功能实现。
 *  实现：
 *      1）Facade类可实现为辅助工具类。
 *      2）Facade类可实现为接口，Facade接口从工厂中获取；优点是：可有选择性地暴露接口方法，尽量减少模块对子系统提供的接口方法。
 *      3）方法实现：只是实现功能的组合调用，即负责将客户端的请求转发给子系统的各个模块处理，本身不进行功能处理。
 *  优点：
 *      1）松散耦合
 *      2）简单易用：客户端只需要跟Facade类交互即可。
 *      3）更好的划分访问层次
 *  本质：封装交互，简化调用。
 *  设计原则：“最少知识原则”
 *  使用场景：
 *      1）希望为复杂的子系统提供一个简单接口，考虑外观模式。
 *      2）若构建多层结构的系统，考虑外观模式，使用外观对象作为每一层的入口，可简化层间调用、松散层间的耦合关系。
 */
public class Facade {

    /**
     * 示意：满足客户需要的功能
     */
    public void test() {
        // 在内部实现时，可能会调用内部的多个模块
        AModelApi a = new AModelApiImpl();
        a.testA();
        BModelApi b = new BModelApiImpl();
        b.testB();
    }

}
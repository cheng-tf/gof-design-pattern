package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Decorator</p>
 * <p>Description: 装饰器接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 20:32</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 装饰模式
 *  定义：动态地给对象添加一些额外的责任；关于增加功能，装饰比生成子类更灵活。
 *  角色：
 *      1）Component：组件对象的接口，可动态添加职责。
 *      2）ConcreteComponent：具体的组件实现，通常为装饰器所装饰的原生对象。
 *      3）Decorator：所有装饰器的抽象父类，需定义一个与组件接口一致的接口，并持有一个Component对象(被装饰)。
 *      4）ConcreteDecorator：具体的装饰器
 *  举例：复杂的奖金计算
 *      1）问题：奖金计算方式复杂，且经常需要调整。
 *      2）需求：简化后的奖金计算。
 *          每个人的当月业务奖金 = 当月销售额 * 3%
 *          每个人的累计奖金 = 总回款额 * 0.1%
 *          团队奖金 = 团队总销售额 * 1%
 *      3）使用装饰模式
 *  认识：
 *      1）功能：动态地从外部为对象添加功能，相当于改变了对象的外观；还可以进行装饰器的复用，
 *      2）对象组合
 *      3）装饰器：
 *         A.可调用被装饰对象的功能，其实是一种递归调用。
 *         B.装饰器之间最好完全独立，不应具有依赖，否则会降低组合的灵活性。
 *      4）装饰器与组建类的关系
 *         A.装饰器用于装饰组件，实现与组件类一致的接口，保证为同一种类型/外观，从而可递归调用下去。
 *         B.组建类不知道装饰器的存在。
 *      5）退化形式
 *      6）Java中的装饰模式应用---IO流
 *          DataInputStream in = new DataInputStream(new BufferedDInputStream(new FileInputStream("test.txt")));
 *          1）IO对象层次结构图
 *              A.InputStream相当于装饰模式的Component
 *              B.FileInputStream、ObjectInputStream、StringBufferInputStream等直接继承，相当于ConcreteComponent
 *              C.FilterInputStream相当于Decorator，而其子类DataInputStream、BufferInputStream等相当于ConcreteDecorator。
 *          2）自己实现的IO流装饰器
 *      7）装饰模式与AOP
 *  优点：
 *      1）比继承更灵活
 *      2）更容易复用功能
 *      3）简化高层定义
 *  缺点：
 *      1）会产生很多细粒度对象
 *  本质：动态组合
 *
 */
public abstract class Decorator extends Component {

    // 组件对象
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        // 转调前后，增加附加操作
        component.operation();
    }

}

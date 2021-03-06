package cn.edu.bupt.opensource.example;

/**
 * <p>Title: State</p>
 * <p>Description: 状态接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 12:45</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 状态模式
 *  定义：允许一个对象在其内部状态改变时，改变其行为。
 *  角色：
 *      1）State：状态接口，用于封装与上下文的一个特定状态所对应的行为。
 *      2）ConcreteState：具体的状态实现
 *      3）Context：环境(上下文)，定义客户端感兴趣的接口，并维护一个具体的状态实例对象。
 *  举例：在线投票
 *      1）控制用户只能投票一次；若他反复投票超过5次，则判定为恶意刷票，取消其资格及投票数据；若超过8次，则加入黑名单，禁止登陆与使用。
 *      2）使用状态模式
 *  认识：
 *      1）状态与行为
 *          A.状态：通常指对象实例的属性值
 *          B.行为：对象的功能方法
 *          C.状态模式：分离状态的行为，通过维护状态的变化，来调用的不同状态所对应的不同功能。
 *          D.状态决定行为！！！
 *      2）行为的平行性
 *      3）上下文与状态处理对象
 *          A.上下文持有状态对象，但并不处理与状态相关的行为，而委托给具体的状态实例对象处理。
 *          B.若状态处理实例需要获取上下文数据，则使上下文作为一个参数传入。
 *          C.客户端一般只与上下文交互，可使用状态对象初始配置上下文，但并不负责运行时的具体维护。
 *      4）不完美的OCP体验
 *      5）状态对象的创建与销毁
 *          A.若进入的状态不可知，且上下文稳定，状态改变、使用不频繁；则推荐在需要时创建，使用完销毁。
 *          B.若状态改变频繁，且状态对象存储着大量数据，则推荐提前创建，且不销毁。
 *          C.若无法确定，而有些状态对象的状态数据量大，则推荐延迟加载与缓存合用的方式（首选！）。
 *      6）状态的维护与转换控制
 *          A.状态维护：即维护状态的数据，设置不同的状态值。
 *          B.状态转换：根据状态的变化，选择不同的状态处理对象。
 *          C.一般情况下，统一在上下文中进行状态的维护。
 *          D.若状态的转换取决于前一个状态处理的结果，或依赖于外部数据，则在状态处理类中进行状态的维护。
 *          E.使用数据库维护状态：状态编码
 *          F.使用数据库维护“转移”
 *      7）模拟工作流
 *  优点：
 *      1）简化应用的逻辑控制
 *      2）更好的分离状态与行为
 *      3）扩展性好
 *      4）显式化的状态转换
 *  缺点：
 *      1）引入太多的状态类
 *  本质：根据状态分离、选择行为
 *  适用场景：
 *      1）若一个对象的行为取决于状态，且必须在运行时根据状态改变行为，可考虑。
 *      2）若一个操作中包含庞大的多分支，且这些分支依赖于状态，可考虑。
 *
 */
public interface State {

    /**
     * 状态对应的处理
     */
    void handle(String sampleParam);

}

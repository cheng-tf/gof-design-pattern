package cn.edu.bupt.opensource.example;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: Composite</p>
 * <p>Description: 组合对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 22:52</p>
 * @author ChengTengfei
 * @version 1.0
 *
 * 组合模式
 *  定义：将对象组合为树形结构，以表示“部分-整体”的层次结构；使得用户对单个对象和组合对象的使用具有一致性。
 *        把相同的基类型的对象组合到树状结构中，其中父节点包含同类型的子节点。
 *  角色：
 *      1）Component：抽象组件对象，为组合中的对象声明接口，用于客户端访问、管理整个对象结构。
 *      2）Leaf：叶子节点对象，定义与实现叶子节点的行为。
 *      3）Composite：组合对象，通常存储子组件。
 *      4）Client：客户端，通过Component组件接口操作组合结构中的组件对象
 *  举例：商品类别树
 *      1）特点：A.仅有一个根节点(无父节点)    B.树枝节点   C.叶子节点(无子节点)
 *      2）使用组合模式
 *  认识：
 *      1）目的：让客户端不再区分组合对象、叶子对象，而是以统一的方式操作。
 *      2）关键：抽象的组件类Component
 *      3）对象树：树形结构，比如XML文件的解析可考虑组合模式。
 *      4）对象递归组合：也称“递归关联”，是对象关联模式的一种。
 *      5）在Component中是否有必要实现一个Component列表？      不好，对于Leaf叶子节点，导致空间的浪费！
 *      6）最大化Component定义
 *          A.通常，对于某些子对象没有意义的方法，提供默认实现、或默认抛出不支持该功能。
 *      7）子部件排序：通常是顺序存储，可考虑结合迭代器模式设计。
 *      8）安全性与透明性
 *          A.透明性(优先)：对于客户端，只需面向Component编程，无需关心具体的实现，但不太安全(可尽量避免)。
 *          B.安全性：将管理子组件操作定义在Composite中，安全，但透明性差。
 *      9）父组件引用
 *          A.在Component中，定义父组件的引用。
 *          B.在Component中，在addChild、removeChild()等方法中维护父组件。
 *      10）环状引用
 *  优点：
 *      1）定义了包含基本对象和组合对象的类层次结构
 *      2）统一了组合对象与叶子对象
 *      3）简化了客户端调用
 *      4）更容易扩展
 *  缺点：
 *      1）难以限制组合中的组件类型
 *  本质：统一叶子对象与组合对象
 *  适用场景：
 *  1）若希望获得对象抽象的树形表示（部分-整体层次结构），可考虑。
 *  2）若希望客户端统一处理组合结构中的所有对象，可考虑。
 *
 */
public class Composite extends Component {

    // 子组件对象集合
    private List<Component> childComponents = null;

    @Override
    public void someOperation() {
        if(childComponents != null) {
            for(Component component : childComponents) {
                component.someOperation();
            }
        }
    }

    @Override
    public void addChild(Component child) {
        // 延迟初始化
        if(childComponents == null) {
            childComponents = new ArrayList<>();
        }
        childComponents.add(child);
    }

    @Override
    public void removeChild(Component child) {
        if(childComponents != null) {
            childComponents.remove(child);
        }
    }

    @Override
    public Component getChildren(int index) {
        if(childComponents != null) {
            if(index > 0 && index < childComponents.size()) {
                return childComponents.get(index);
            }
        }
        return null;
    }

}

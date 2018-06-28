package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 17:20</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 定义多个组合对象
        Component root = new Composite();
        Component composite1 = new Composite();
        Component composite2 = new Composite();
        // #2 定义多个叶子节点对象
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();
        // #3 组合为树形结构
        root.addChild(composite1);
        root.addChild(composite2);
        root.addChild(leaf1);
        composite1.addChild(leaf2);
        composite2.addChild(leaf3);
        // #4 操作
        System.out.println(root.getChildren(1));
    }


}

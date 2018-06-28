package cn.edu.bupt.opensource.example2;
/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 17:35</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 定义多个组合对象
        Component root = new Composite("服装");
        Component composite1 = new Composite("男装");
        Component composite2 = new Composite("女装");
        // #2 定义多个叶子节点对象
        Component leaf1 = new Leaf("衬衣");
        Component leaf2 = new Leaf("夹克");
        Component leaf3 = new Leaf("裙子");
        Component leaf4 = new Leaf("比基尼");
        // #3 组合为树形结构
        root.addChild(composite1);
        root.addChild(composite2);
        composite1.addChild(leaf1);
        composite1.addChild(leaf2);
        composite2.addChild(leaf3);
        composite2.addChild(leaf4);
        // #4 操作
        root.printStruct("");
    }


}

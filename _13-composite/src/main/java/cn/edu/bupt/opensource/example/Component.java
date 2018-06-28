package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Component</p>
 * <p>Description: 抽象组件对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 17:05</p>
 * @author ChengTengfei
 * @version 1.0
 */
public abstract class Component {

    /**
     * 某些操作
     */
    public abstract void someOperation();

    /**
     * 向组合对象中加入组件对象(缺省实现)
     */
    public void addChild(Component child) {
        // 叶子对象无此功能
        throw new UnsupportedOperationException("对象不支持该功能");
    }

    /**
     * 向组合对象中移除组件对象(缺省实现)
     */
    public void removeChild(Component child) {
        // 叶子对象无此功能
        throw new UnsupportedOperationException("对象不支持该功能");
    }

    /**
     * 返回某个索引对应的组件对象
     */
    public Component getChildren(int index) {
        // 叶子对象无此功能
        throw new UnsupportedOperationException("对象不支持该功能");
    }


}

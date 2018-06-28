package cn.edu.bupt.opensource.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: Composite</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 17:30</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Composite extends Component {

    // 子组件对象集合
    private List<Component> childComponents = null;

    // 组合对象名称
    private String name = "";

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "+" + name);
        if(childComponents != null) {
            preStr += "  ";
            for(Component component : childComponents) {
                component.printStruct(preStr);
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

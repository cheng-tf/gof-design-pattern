package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteDecoratorA</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 20:44</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    /**
     * 新的职责
     */
    public void addBehavior() {

    }

    public void operation() {
        super.operation();
        addBehavior();
    }

}

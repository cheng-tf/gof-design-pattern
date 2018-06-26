package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteFactory2</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 22:50</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteFactory2 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }

}

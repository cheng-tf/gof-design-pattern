package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteFactory1</p>
 * <p>Description: 抽象工厂的实现（具体工厂）1 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 22:39</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return null;
    }
}

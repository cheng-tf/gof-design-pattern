package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteProtype2</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 15:39</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteProtype2 implements Prototype {

    @Override
    public Prototype clone() {
        return new ConcreteProtype2();
    }

}

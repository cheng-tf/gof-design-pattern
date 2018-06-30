package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteFlyweight</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 15:51</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteFlyweight implements Flyweight {

    // 内部状态
    private String intriState;

    public ConcreteFlyweight(String intriState) {
        this.intriState = intriState;
    }


    @Override
    public void operation(String extraState) {
        // 具体处理
    }

}

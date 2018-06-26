package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteBuilder</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 12:29</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteBuilder implements Builder {

    // 最终构建的产品对象
    private Product result;

    public Product getResult() {
        return result;
    }

    @Override
    public void buildPart() {
        // 构建某个部件的功能处理
    }

}

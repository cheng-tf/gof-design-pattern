package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Aggregate</p>
 * <p>Description: 聚合对象的接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 17:22</p>
 * @author ChengTengfei
 * @version 1.0
 */
public abstract class Aggregate {

    /**
     * 工厂方法，创建迭代器接口
     */
    public abstract Iterator createIterator();

}

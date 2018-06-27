package cn.edu.bupt.opensource.example;

import java.io.ObjectOutputStream;

/**
 * <p>Title: ConcreteAggregate</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 17:22</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteAggregate extends Aggregate {

    // 具体内容
    private String[] strArr = null;

    public ConcreteAggregate(String[] strArr) {
        this.strArr = strArr;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    /**
     * 获取索引所对应的元素
     */
    public Object get(int index){
        Object object = null;
        if(index < strArr.length) {
            object = strArr[index];
        }
        return object;
    }

    /**
     * 获取聚合对象的大小
     */
    public int size() {
        return strArr.length;
    }


}

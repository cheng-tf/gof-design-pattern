package cn.edu.bupt.opensource.example3;

import cn.edu.bupt.opensource.example.ConcreteAggregate;

/**
 * <p>Title: IteratorArray</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 18:24</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class IteratorArray implements Iterator {

    // 具体的聚合对象
    private ManagerSalary aggregate;

    public IteratorArray(ManagerSalary aggregate) {
        this.aggregate = aggregate;
    }

    // 内部索引，记录当前迭代的索引位置
    private int index = -1;

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if(index < this.aggregate.size()) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        if(index == this.aggregate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }

}

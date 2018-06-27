package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 17:33</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        String[] strArr = new String[]{"孙中山", "鲁迅", "庄子"};
        // #1 创建聚合对象
        Aggregate aggregate = new ConcreteAggregate(strArr);
        // #2 创建迭代器对象
        Iterator iterator = aggregate.createIterator();
        // #3 循环输出
        iterator.first();
        while(!iterator.isDone()) {
            System.out.println("Object = " + iterator.currentItem());
            iterator.next();
        }
    }

}

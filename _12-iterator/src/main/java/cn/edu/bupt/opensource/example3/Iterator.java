package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Iterator</p>
 * <p>Description: 迭代器接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 17:13</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface Iterator {

    /**
     * 移动到聚合对象的下第一个位置
     */
    void first();

    /**
     * 移动到聚合对象的下一个位置
     */
    void next();

    /**
     * 判断是否已移动到聚合对象的最后一个位置
     */
    boolean isDone();

    /**
     * 获取迭代的当前元素
     */
    Object currentItem();

}

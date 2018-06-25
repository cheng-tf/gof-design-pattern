package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Adaptee</p>
 * <p>Description: 已存在的接口，需要被适配 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 23:27</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Adaptee {

    /**
     * 已存在，且已实现
     */
    public void specificRequest() {
        // 具体的功能处理
        System.out.println("测试！");
    }


}

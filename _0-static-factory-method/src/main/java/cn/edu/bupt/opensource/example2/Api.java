package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Api</p>
 * <p>Description: 定义接口，该接口可通过简单工厂来创建 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-21 21:29</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface Api {

    /**
     * 具体业务功能
     */
    void operation(String str);

}

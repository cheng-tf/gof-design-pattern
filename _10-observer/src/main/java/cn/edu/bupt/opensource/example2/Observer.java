package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Observer</p>
 * <p>Description: 观察者接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 11:16</p>
 * @author ChengTengfei
 * @version 1.0
 *
 */
public interface Observer {

    /**
     * 更新
     */
    void update(Subject subject);

}

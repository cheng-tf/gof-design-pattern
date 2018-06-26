package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Mediator</p>
 * <p>Description: 中介者 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 16:57</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface Mediator {

    /**
     * 同事对象的交互
     */
    void changed(Colleague colleague);

}

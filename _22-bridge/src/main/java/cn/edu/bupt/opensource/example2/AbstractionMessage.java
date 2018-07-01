package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: AbstractionMessage</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 11:58</p>
 * @author ChengTengfei
 * @version 1.0
 */
public abstract class AbstractionMessage {

    // 实现层对象
    private MessageImplementor implementor;

    public AbstractionMessage(MessageImplementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 发送消息
     */
    public void sendMessage(String message, String toUser) {
        this.implementor.send(message, toUser);
    }



}

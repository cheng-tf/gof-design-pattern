package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: CommonMessage</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 12:00</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class CommonMessage extends AbstractionMessage {

    public CommonMessage(MessageImplementor implementor) {
        super(implementor);
    }

    /**
     * 发送消息
     */
    public void sendMessage(String message, String toUser) {
        // 普通消息，直接调用父类方法
        super.sendMessage(message, toUser);
    }

}

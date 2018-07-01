package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: CommonMessage</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 12:00</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class UrgencyMessage extends AbstractionMessage {

    public UrgencyMessage(MessageImplementor implementor) {
        super(implementor);
    }

    /**
     * 发送消息
     */
    public void sendMessage(String message, String toUser) {
        // 加急消息
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

    /**
     * 扩展消息监控
     */
    public Object watch(String messageId) {
        return null;
    }




}

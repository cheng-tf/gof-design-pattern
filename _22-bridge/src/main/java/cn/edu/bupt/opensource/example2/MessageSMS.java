package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: MessageSMS</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 11:56</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class MessageSMS implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用站内短消息的方式，发送消息：" + message + "给" + toUser);
    }

}

package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: MessageEmail</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 11:56</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class MessageEmail implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用Email的方式，发送消息：" + message + "给" + toUser);
    }

}

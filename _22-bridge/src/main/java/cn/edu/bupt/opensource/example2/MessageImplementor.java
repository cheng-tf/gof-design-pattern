package cn.edu.bupt.opensource.example2;
/**
 * <p>Title: MessageImplementor</p>
 * <p>Description: 发送消息的统一接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 11:54</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface MessageImplementor {

    /**
     * 发送消息
     * @param message   消息内容
     * @param toUser    接收人
     */
    void send(String message, String toUser);


}

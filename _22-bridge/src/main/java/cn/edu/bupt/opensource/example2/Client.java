package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 12:03</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // SMS发送
        MessageImplementor implementor = new MessageSMS();
        AbstractionMessage message = new CommonMessage(implementor);
        message.sendMessage("一杯茶", "孙中山");
        message = new UrgencyMessage(implementor);
        message.sendMessage("一杯茶", "孙中山");
        // Email发送
        implementor = new MessageEmail();
        message = new CommonMessage(implementor);
        message.sendMessage("一杯茶", "孙中山");
        message = new UrgencyMessage(implementor);
        message.sendMessage("一杯茶", "孙中山");
    }

}

package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Client</p>
 * <p>Description:  </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 15:36</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public void assemble() {
        // #1 创建接收者
        Receiver receiver = new Receiver();
        // #2 创建命令对象，设置接收者
        Command command = new ConcreteCommand(receiver);
        // #3 创建Invoker，设置命令对象
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
    }

}

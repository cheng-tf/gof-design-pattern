package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteCommand</p>
 * <p>Description: 命令对象的实现 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 15:33</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteCommand implements Command {

    // 接收者
    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    // 状态
    private String state;

    @Override
    public void execute() {
        // 转调接收者的方法
        receiver.action();
    }

}

package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Invoker</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 15:37</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Invoker {

    // 命令对象
    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }


}

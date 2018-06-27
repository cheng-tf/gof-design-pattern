package cn.edu.bupt.opensource.example2;
/**
 * <p>Title: Box</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 16:10</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Box {

    // 命令
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void openButtonPressed() {
        // 按下按钮，执行命令
        command.execute();
    }

}

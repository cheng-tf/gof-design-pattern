package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: CommandOpen</p>
 * <p>Description: 开机命令实现 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 16:04</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class CommandOpen implements Command{

    // 主板对象(接收者)
    private Mainboard mainboard;

    public CommandOpen(Mainboard mainboard) {
        this.mainboard = mainboard;
    }

    @Override
    public void execute() {
        mainboard.open();
    }

}

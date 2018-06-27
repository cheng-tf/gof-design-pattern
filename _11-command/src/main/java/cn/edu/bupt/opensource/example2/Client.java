package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 16:12</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Mainboard mainboard = new MainboardGI();
        Command command = new CommandOpen(mainboard);
        Box box = new Box();
        box.setCommand(command);
        box.openButtonPressed();
    }

}

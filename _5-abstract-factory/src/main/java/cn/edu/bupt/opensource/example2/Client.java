package cn.edu.bupt.opensource.example2;
/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 10:19</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 创建装机工程师对象
        ComputerEngineer computerEngineer = new ComputerEngineer();
        // #2 告诉工程师自己选择的配件，便于其组装电脑
        computerEngineer.makeComputer(1,2);
    }

}

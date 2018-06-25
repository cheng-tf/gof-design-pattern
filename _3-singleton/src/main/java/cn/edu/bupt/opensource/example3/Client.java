package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 15:18</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 创建读取应用配置文件的对象
        AppConfig appConfig = AppConfig.getInstance();
        System.out.println("paramA = " + appConfig.getParamA() + ", paramB = " + appConfig.getParamB());
    }

}

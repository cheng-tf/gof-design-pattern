package cn.edu.bupt.opensource.example2;

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
        AppConfig appConfig = new AppConfig();
        System.out.println("paramA = " + appConfig.getParamA() + ", paramB = " + appConfig.getParamB());
    }

}

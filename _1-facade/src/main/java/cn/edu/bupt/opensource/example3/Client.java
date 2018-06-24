package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 11:49</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 客户端必须了解这些模块
        //new ModelController().generate();
        //new ModelService().generate();;
        //new ModelDAO().generate();

        // 使用外观模式，直接调用Facade类，客户端不再直接与诸多模块交互
        new Facade().generate();
    }

}

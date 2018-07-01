package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 11:00</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 组装责任链
        Handler handler = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler2();
        handler.setSuccessor(handler2);
        // #2 提交请求
        handler.handleRequest();
    }

}

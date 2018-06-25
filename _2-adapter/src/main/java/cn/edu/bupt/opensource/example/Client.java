package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Client</p>
 * <p>Description: 客户端 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 23:28</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 创建需要被适配的对象
        Adaptee adaptee = new Adaptee();
        // 创建客户端需要电影的接口对象
        Adapter adapter = new Adapter(adaptee);
        // 请求处理
        adapter.request();
    }

}

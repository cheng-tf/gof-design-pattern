package cn.edu.bupt.opensource.example;
/**
 * <p>Title: Client</p>
 * <p>Description: 客户端，使用Api接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-21 21:28</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 通过简单工厂获取接口对象实例
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂");
    }

}

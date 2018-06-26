package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Client</p>
 * <p>Description: 使用原型的客户端 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 15:40</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    // 原型接口对象
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation() {
        Prototype newPrototype = prototype.clone();
    }


}

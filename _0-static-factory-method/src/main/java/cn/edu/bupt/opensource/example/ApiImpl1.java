package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ApiImpl1</p>
 * <p>Description: 接口的具体实现类1 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-21 21:32</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ApiImpl1 implements Api {

    public void operation(String str) {
        System.out.println("Impl1 s = " + str);
    }

}

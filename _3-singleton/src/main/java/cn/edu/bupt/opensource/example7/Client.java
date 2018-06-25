package cn.edu.bupt.opensource.example7;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 16:29</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            Singleton.uniqueInstance.singletonoperation();
        }

    }

}

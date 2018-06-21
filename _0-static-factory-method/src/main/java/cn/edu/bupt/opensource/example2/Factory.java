package cn.edu.bupt.opensource.example2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * <p>Title: Factory</p>
 * <p>Description: 工厂类，负责创建Api对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-21 21:36</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Factory {

    /**
     * 根据配置文件的参数，来创建Api接口的实例对象
     */
    public static Api createApi() {
        // 读取配置文件
        Properties p = new Properties();
        InputStream in = null;
        try {
            in = Factory.class.getResourceAsStream("FactoryTest.properties");
            p.load(in);
        } catch (IOException e) {
            System.out.println("装载配置文件出错，具体堆栈信息如下：");
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 使用反射创建实例对象
        Api api = null;
        try {
            api = (Api)Class.forName(p.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }

}

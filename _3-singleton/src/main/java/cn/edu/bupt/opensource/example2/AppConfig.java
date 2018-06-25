package cn.edu.bupt.opensource.example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * <p>Title: AppConfig</p>
 * <p>Description: 读取应用配置文件 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 15:12</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class AppConfig {

    // 存储配置文件中的参数
    private String paramA;
    private String paramB;

    public String getParamA() {
        return paramA;
    }

    public String getParamB() {
        return paramB;
    }

    // 构造方法
    public AppConfig() {
        readConfig();
    }

    /**
     * 读取配置文件
     */
    private void readConfig() {
        Properties p = new Properties();
        InputStream is = null;
        try {
            System.out.println("读取配置文件");
            is = new FileInputStream(new File("config.properties"));
            p.load(is);
            this.paramA = p.getProperty("paramA");
            this.paramB = p.getProperty("paramB");
        } catch (IOException e) {
            System.out.println("装载配置文件出错，具体堆栈信息如下：");
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

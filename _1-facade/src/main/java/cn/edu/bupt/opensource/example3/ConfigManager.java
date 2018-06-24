package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: ConfigManager</p>
 * <p>Description: 配置管理，负责读取配置文件；同时将配置文件的内容设置在单利的配置Model中 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 11:41</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConfigManager {

    private static ConfigManager manager = null;

    private static ConfigModel configModel = null;

    public static ConfigManager getInstance() {
        if(manager == null) {
            manager = new ConfigManager();
            configModel = new ConfigModel();
            // 读取配置文件，同时设置数据到Model中
        }
        return manager;
    }

    // 获取配置数据
    public ConfigModel getConfigData() {
        return configModel;
    }

}

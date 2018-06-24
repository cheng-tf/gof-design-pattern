package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: ModelBusiness</p>
 * <p>Description: 逻辑层生成模块 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 11:32</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ModelService {

    public void generate() {
        // #1 从配置管理获取配置信息
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();
        if(configModel.isNeedGenService()) {
            // 按照要求生成代码文件
            System.out.println("正在生成逻辑层代码文件");
        }
    }

}

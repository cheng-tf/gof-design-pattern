package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: ConfigModel</p>
 * <p>Description: 描述数据配置 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 11:36</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConfigModel {

    // 是否生成表现层，默认为true
    private boolean needGenController = true;

    // 是否生成逻辑层，默认为true
    private boolean needGenService = true;

    // 是否生成DAO层，默认为true
    private boolean needGenDAO = true;

    public boolean isNeedGenController() {
        return needGenController;
    }

    public void setNeedGenController(boolean needGenController) {
        this.needGenController = needGenController;
    }

    public boolean isNeedGenService() {
        return needGenService;
    }

    public void setNeedGenService(boolean needGenService) {
        this.needGenService = needGenService;
    }

    public boolean isNeedGenDAO() {
        return needGenDAO;
    }

    public void setNeedGenDAO(boolean needGenDAO) {
        this.needGenDAO = needGenDAO;
    }
}

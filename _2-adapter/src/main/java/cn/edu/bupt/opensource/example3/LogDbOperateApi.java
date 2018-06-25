package cn.edu.bupt.opensource.example3;

import java.util.List;

/**
 * <p>Title: LogDbOperateApi</p>
 * <p>Description: 定义操作日志的应用接口（增删改查） </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 13:29</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface LogDbOperateApi {

    /**
     * 新增日志
     */
    void insertlog(LogModel logModel);

    /**
     * 修改日志
     */
    void updatelog(LogModel logModel);

    /**
     * 删除日志
     */
    void removelog(LogModel logModel);

    /**
     * 获取日志列表
     */
    List<LogModel> getLogList();

}

package cn.edu.bupt.opensource.example4;

import java.util.List;

/**
 * <p>Title: LogDbOperateApiImpl</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 14:02</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class LogDbOperateApiImpl implements LogDbOperateApi{

    @Override
    public void insertlog(LogModel logModel) {
        System.out.println("Now in LogDbOperateApiImpl.insertlog, logModel = " + logModel);
    }

    @Override
    public void updatelog(LogModel logModel) {
        System.out.println("Now in LogDbOperateApiImpl.updatelog, logModel = " + logModel);
    }

    @Override
    public void removelog(LogModel logModel) {
        System.out.println("Now in LogDbOperateApiImpl.removelog, logModel = " + logModel);
    }

    @Override
    public void removeAllLog() {
        System.out.println("Now in LogDbOperateApiImpl.removeAllLog");
    }

    @Override
    public List<LogModel> getLogList() {
        System.out.println("Now in LogDbOperateApiImpl.getLogList");
        return null;
    }
}

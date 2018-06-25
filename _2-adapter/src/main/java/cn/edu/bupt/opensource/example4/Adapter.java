package cn.edu.bupt.opensource.example4;

import java.util.List;

/**
 * <p>Title: Adapter</p>
 * <p>Description: 适配器对象：将记录日志文件的功能是配成v2.0需要的增删改查的功能 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 13:34</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Adapter implements LogDbOperateApi, LogFileOperateApi {

    // 持有被适配的接口对象
    private LogFileOperateApi fileLog;
    private LogDbOperateApi dbLog;

    // 构造方法，传入被适配的接口对象
    public Adapter(LogFileOperateApi fileLog, LogDbOperateApi dbLog) {
        this.fileLog = fileLog;
        this.dbLog = dbLog;
    }

    @Override
    public void insertlog(LogModel logModel) {
        long a1 = System.currentTimeMillis();
        List<LogModel> list = fileLog.readLogFile();
        list.add(logModel);
        fileLog.writeLogFile(list);
        long a2 = System.currentTimeMillis();
        System.out.println("Create log time: " + (a2 - a1));
    }

    @Override
    public void updatelog(LogModel logModel) {
        List<LogModel> list = fileLog.readLogFile();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getLogId().equals(logModel.getLogId())) {
                list.set(i, logModel);
                break;
            }
        }
        fileLog.writeLogFile(list);
    }

    @Override
    public void removelog(LogModel logModel) {
        List<LogModel> list = fileLog.readLogFile();
        list.remove(logModel);
        fileLog.writeLogFile(list);
    }

    @Override
    public void removeAllLog() {
        System.out.println("Now in Adapter.removeAllLog");
    }

    @Override
    public List<LogModel> getLogList() {
        return fileLog.readLogFile();
    }

    @Override
    public List<LogModel> readLogFile() {
        return dbLog.getLogList();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        dbLog.removeAllLog();
        for(LogModel logModel : list) {
            dbLog.insertlog(logModel);
        }
    }
}

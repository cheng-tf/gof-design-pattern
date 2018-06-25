package cn.edu.bupt.opensource.example3;

import java.util.List;

/**
 * <p>Title: Adapter</p>
 * <p>Description: 适配器对象：将记录日志文件的功能是配成v2.0需要的增删改查的功能 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 13:34</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Adapter implements LogDbOperateApi{

    // 持有被适配的接口对象
    private LogFileOperateApi adaptee;

    // 构造方法，传入被适配的接口对象
    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void insertlog(LogModel logModel) {
        long a1 = System.currentTimeMillis();
        List<LogModel> list = adaptee.readLogFile();
        list.add(logModel);
        adaptee.writeLogFile(list);
        long a2 = System.currentTimeMillis();
        System.out.println("Create log time: " + (a2 - a1));
    }

    @Override
    public void updatelog(LogModel logModel) {
        List<LogModel> list = adaptee.readLogFile();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getLogId().equals(logModel.getLogId())) {
                list.set(i, logModel);
                break;
            }
        }
        adaptee.writeLogFile(list);
    }

    @Override
    public void removelog(LogModel logModel) {
        List<LogModel> list = adaptee.readLogFile();
        list.remove(logModel);
        adaptee.writeLogFile(list);
    }

    @Override
    public List<LogModel> getLogList() {
        return adaptee.readLogFile();
    }

}

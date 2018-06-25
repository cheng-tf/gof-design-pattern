package cn.edu.bupt.opensource.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: Client</p>
 * <p>Description: 客户端 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 13:18</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 准备日志内容（测试数据）
        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("admin");
        logModel.setOperateTime("2018-06-15 13:00:00");
        logModel.setLogContent("这是一条测试数据。");
        // 创建操作日志文件的对象
        LogFileOperateApi api = new LogFileOperateApiImpl("");
        // 创建v2.0操作日志的接口对象
        LogDbOperateApi logDbApi = new Adapter(api);
        // 写入日志文件
        logDbApi.insertlog(logModel);
        // 读取日志文件
        List<LogModel> readLog = logDbApi.getLogList();
        System.out.println("readLog = " + readLog);
    }

}

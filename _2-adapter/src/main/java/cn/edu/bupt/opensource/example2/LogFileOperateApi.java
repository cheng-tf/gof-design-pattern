package cn.edu.bupt.opensource.example2;

import java.util.List;

/**
 * <p>Title: LogFileOperateApi</p>
 * <p>Description: 日志文件操作接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 23:54</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface LogFileOperateApi {

    /**
     * 读取日志文件，从文件中获取存储的日志列表对象
     */
    List<LogModel> readLogFile();

    /**
     * 写入日志文件
     */
    void writeLogFile(List<LogModel> list);

}

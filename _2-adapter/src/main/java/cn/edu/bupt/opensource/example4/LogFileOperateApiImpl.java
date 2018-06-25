package cn.edu.bupt.opensource.example4;

import java.io.*;
import java.util.List;

/**
 * <p>Title: LogFileOperateApiImpl</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-24 23:57</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class LogFileOperateApiImpl implements LogFileOperateApi {


    // 日志文件的存储路径及名称，默认为当前classpath路径
    private String logFilePathName = "adapterLog.log";

    // 构造方法
    public LogFileOperateApiImpl(String logFilePathName) {
        if(logFilePathName != null && logFilePathName.trim().length() > 0) {
            this.logFilePathName = logFilePathName;
        }
    }

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream ois = null;
        try {
            File file = new File(logFilePathName);
            if(file.exists()) {
                ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List<LogModel>) ois.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        File file = new File(logFilePathName);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oos.writeObject(list);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




}

package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: ExportDB</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 17:05</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportDB implements ExportApi {

    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到数据库备份文件");
        return true;
    }

}

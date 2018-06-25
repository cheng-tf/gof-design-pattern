package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: ExportXmlFile</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 17:15</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportXmlFile implements ExportApi {

    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到XML文件");
        return false;
    }

}

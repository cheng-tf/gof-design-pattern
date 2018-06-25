package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: ExportTxtFile</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 17:07</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportTxtFile implements ExportApi {

    @Override
    public boolean export(String data) {
        System.out.println("导出数据" + data + "到文本文件");
        return false;
    }

}

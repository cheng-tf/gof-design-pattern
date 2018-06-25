package cn.edu.bupt.opensource.example3;
/**
 * <p>Title: ExportApi</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 16:59</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface ExportApi {

    /**
     * 导出内容成为文件
     * @param data  需要保存的数据
     * @return      是否成功
     */
    public boolean export(String data);

}

package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: ExportOperateDB</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 17:23</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportOperateDB extends ExportOperate {

    protected ExportApi factorymethod() {
        return new ExportDB();
    }

}

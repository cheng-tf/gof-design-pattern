package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: ExportOperateXml</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 17:30</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportOperateXmlFile extends ExportOperate{

    @Override
    protected ExportApi factorymethod() {
        return new ExportXmlFile();
    }

}

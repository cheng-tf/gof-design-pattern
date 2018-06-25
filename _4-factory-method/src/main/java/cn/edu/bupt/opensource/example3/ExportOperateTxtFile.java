package cn.edu.bupt.opensource.example3;

import cn.edu.bupt.opensource.example2.ExportApi;
import cn.edu.bupt.opensource.example2.ExportOperate;
import cn.edu.bupt.opensource.example2.ExportTxtFile;

/**
 * <p>Title: ExportOperateTxtFile</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 17:22</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportOperateTxtFile extends ExportOperate {

    protected ExportApi factorymethod(){
        return new ExportTxtFile();
    }

}

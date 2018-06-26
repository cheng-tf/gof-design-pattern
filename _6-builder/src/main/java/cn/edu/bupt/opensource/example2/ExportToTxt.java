package cn.edu.bupt.opensource.example2;

import java.util.Collection;
import java.util.Map;

/**
 * <p>Title: ExportToTxt</p>
 * <p>Description: 导出数据到文本 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 12:41</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportToTxt {

    /**
     * 导出
     */
    public void export(ExportModelHead head, Map<String, Collection<ExportModelData>> mapData, ExportModelTail tail) {
        StringBuffer stringBuffer = new StringBuffer();
        // #1 文件头
        stringBuffer.append(head.getDeptId() + "," + head.getExportDate() + "\n");
        // #2 文件体
        for(String tableName : mapData.keySet()) {
            stringBuffer.append(tableName + "\n");
            for(ExportModelData emd : mapData.get(tableName)) {
                stringBuffer.append(emd.getProductId() + "," + emd.getPrice() + "," + emd.getAmount() + "\n");
            }
        }
        // 文件尾
        stringBuffer.append(tail.getExportUser());
        System.out.println("输出的文件内容：\n" + stringBuffer.toString());
    }

}

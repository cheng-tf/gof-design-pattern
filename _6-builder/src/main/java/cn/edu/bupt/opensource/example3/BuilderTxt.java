package cn.edu.bupt.opensource.example3;

import java.util.Collection;
import java.util.Map;

/**
 * <p>Title: BuilderTxt</p>
 * <p>Description: 实现导出数据到文本文件的构建器对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 14:33</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class BuilderTxt implements Builder {

    // 用于记录构建的文本内容，相当于Product
    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void buildHead(ExportModelHead head) {
        stringBuffer.append(head.getDeptId() + "," + head.getExportDate() + "\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportModelData>> mapData) {
        for(String tableName : mapData.keySet()) {
            stringBuffer.append(tableName + "\n");
            for(ExportModelData emd : mapData.get(tableName)) {
                stringBuffer.append(emd.getProductId() + "," + emd.getPrice() + "," + emd.getAmount() + "\n");
            }
        }
    }

    @Override
    public void buildTail(ExportModelTail tail) {
        stringBuffer.append(tail.getExportUser());
    }

    public StringBuffer getResult() {
        return stringBuffer;
    }

}

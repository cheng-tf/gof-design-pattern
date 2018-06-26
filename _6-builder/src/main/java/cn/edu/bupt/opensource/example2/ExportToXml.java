package cn.edu.bupt.opensource.example2;

import java.util.Collection;
import java.util.Map;

/**
 * <p>Title: ExportToXml</p>
 * <p>Description: 导出数据到XML文件 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 12:55</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportToXml {

    /**
     * 导出
     */
    public void export(ExportModelHead head, Map<String, Collection<ExportModelData>> mapData, ExportModelTail tail) {
        StringBuffer stringBuffer = new StringBuffer();
        // #1 文件头
        stringBuffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
        stringBuffer.append("<Report>\n");
        stringBuffer.append("   <Header>\n");
        stringBuffer.append("       <DepId>" + head.getDeptId() + "</DepId>\n");
        stringBuffer.append("       <ExportDate>" + head.getExportDate() + "</ExportDate>\n");
        stringBuffer.append("   </Header>\n");
        // #2 文件体
        stringBuffer.append("   <Body>\n");
        for(String tableName : mapData.keySet()) {
            stringBuffer.append("       <Datas  TableName=\"" +tableName + "\">\n");
            for(ExportModelData emd : mapData.get(tableName)) {
                stringBuffer.append("           <Data>\n");
                stringBuffer.append("               <ProductId>" + emd.getProductId() + "</ProductId>\n");
                stringBuffer.append("               <Price>" + emd.getPrice() + "</Price>\n");
                stringBuffer.append("               <Amount>" + emd.getAmount() + "</Amount>\n");
                stringBuffer.append("           </Data>\n");
            }
            stringBuffer.append("       </Datas>\n");
        }
        stringBuffer.append("   </Body>\n");
        // 文件尾
        stringBuffer.append("   <Footer>\n");
        stringBuffer.append("       <ExportUser>" + tail.getExportUser() + "</ExportUser>\n");
        stringBuffer.append("   </Footer>\n");
        stringBuffer.append("</Report>\n");
        System.out.println("输出的文件内容：\n" + stringBuffer.toString());
    }

}

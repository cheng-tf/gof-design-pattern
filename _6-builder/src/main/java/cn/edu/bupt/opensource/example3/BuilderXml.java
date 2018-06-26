package cn.edu.bupt.opensource.example3;

import java.util.Collection;
import java.util.Map;

/**
 * <p>Title: BuilderXml</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 14:37</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class BuilderXml implements Builder {

    // 用于记录构建的文本内容，相当于Product
    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void buildHead(ExportModelHead head) {
        stringBuffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
        stringBuffer.append("<Report>\n");
        stringBuffer.append("   <Header>\n");
        stringBuffer.append("       <DepId>" + head.getDeptId() + "</DepId>\n");
        stringBuffer.append("       <ExportDate>" + head.getExportDate() + "</ExportDate>\n");
        stringBuffer.append("   </Header>\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportModelData>> mapData) {
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
    }

    @Override
    public void buildTail(ExportModelTail tail) {
        // #1 创建部件对象
        String str = "   <Footer>\n";
        str = str + "       <ExportUser>" + tail.getExportUser() + "</ExportUser>\n";
        str = str + "   </Footer>\n";
        str = str + "</Report>\n";
        // #2 组装部件
        stringBuffer.append(str);
        //stringBuffer.append("   <Footer>\n");
        //stringBuffer.append("       <ExportUser>" + tail.getExportUser() + "</ExportUser>\n");
        //stringBuffer.append("   </Footer>\n");
        //stringBuffer.append("</Report>\n");
    }

    public StringBuffer getResult() {
        return stringBuffer;
    }
}

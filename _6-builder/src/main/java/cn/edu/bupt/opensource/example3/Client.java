package cn.edu.bupt.opensource.example3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 13:08</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 测试数据
        ExportModelHead head = new ExportModelHead();
        head.setDeptId("分公司");
        head.setExportDate("2018-06-26");
        Map<String, Collection<ExportModelData>> mapData = new HashMap<>();
        Collection<ExportModelData> collection = new ArrayList<>();
        ExportModelData data1 = new ExportModelData();
        data1.setProductId("产品001号");
        data1.setPrice(100);
        data1.setAmount(80);
        ExportModelData data2 = new ExportModelData();
        data2.setProductId("产品002号");
        data2.setPrice(99);
        data2.setAmount(55);
        collection.add(data1);
        collection.add(data2);
        mapData.put("销售记录表", collection);
        ExportModelTail tail = new ExportModelTail();
        tail.setExportUser("张三");
        // 输出文本文件测试
        BuilderTxt builderTxt = new BuilderTxt();
        Director director = new Director(builderTxt);
        director.construct(head, mapData, tail);
        System.out.println("输出到文本文件：\n" + builderTxt.getResult().toString());
        // 输出XML文件测试
        BuilderXml builderXml = new BuilderXml();
        director = new Director(builderXml);
        director.construct(head, mapData, tail);
        System.out.println("输出到XML文件：\n" + builderXml.getResult().toString());
    }



}

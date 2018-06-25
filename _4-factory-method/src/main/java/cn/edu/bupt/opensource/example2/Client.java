package cn.edu.bupt.opensource.example2;
/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 17:09</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        ExportOperate exportOperate =  new ExportOperate();
        exportOperate.export(2, "导出的测试数据");
    }

}

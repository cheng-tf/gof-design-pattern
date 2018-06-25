package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: ExportOperate</p>
 * <p>Description: 不使用模式 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 17:01</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportOperate {

    /**
     * 导出文件
     * @param type  导出类型
     * @param data  需保存的数据
     * @return      是否成功
     */
    public boolean export(int type, String data) {
        // #1 准备工作
        System.out.println("Now 进行数据校验");
        System.out.println("Now 进行数据转换");
        System.out.println("Now 进行数据合适的封装");
        // #2 真正导出
        // 根据类型选择创建哪一个实现对象
        ExportApi api = null;
        if(type == 1) {
            api = new ExportTxtFile();
        } else if(type == 2) {
            api = new ExportDB();
        }
        return api.export(data);
    }


}

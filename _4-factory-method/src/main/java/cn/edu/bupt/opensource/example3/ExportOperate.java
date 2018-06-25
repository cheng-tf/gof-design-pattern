package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: ExportOperate</p>
 * <p>Description: 不使用模式 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-25 17:01</p>
 * @author ChengTengfei
 * @version 1.0
 */
public abstract class ExportOperate {

    /**
     * 工厂方法：创建导出的文件对象的接口对象
     */
    protected abstract ExportApi factorymethod();

    /**
     * 导出文件
     */
    public boolean export(String data) {
        // #1 准备工作
        System.out.println("Now 进行数据校验");
        System.out.println("Now 进行数据转换");
        System.out.println("Now 进行数据合适的封装");
        // #2 使用工厂方法
        return factorymethod().export(data);
    }

}

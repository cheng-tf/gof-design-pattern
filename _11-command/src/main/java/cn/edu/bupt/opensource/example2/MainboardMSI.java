package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: MainboardMSI</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 16:09</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class MainboardMSI implements Mainboard {

    @Override
    public void open() {
        System.out.println("微星主板正在开机启动，请等候");
        System.out.println("接通电源--------------------");
        System.out.println("设备检查--------------------");
        System.out.println("装载系统--------------------");
        System.out.println("已正常运转，请操作----------");
    }

}

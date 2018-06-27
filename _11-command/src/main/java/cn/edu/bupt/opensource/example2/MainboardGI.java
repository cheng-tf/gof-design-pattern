package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: MainboardGI</p>
 * <p>Description: 技嘉主板 接收者 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 16:06</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class MainboardGI implements Mainboard {

    @Override
    public void open() {
        System.out.println("技嘉主板正在开机启动，请等候");
        System.out.println("接通电源--------------------");
        System.out.println("设备检查--------------------");
        System.out.println("装载系统--------------------");
        System.out.println("已正常运转，请操作----------");
    }

}

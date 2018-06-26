package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: MainboardMSI</p>
 * <p>Description: 微星 主板 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 10:05</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class MainboardMSI implements Mainboard {

    // CPU插槽的孔数
    private int cpuHoles = 0;

    // 构造方法
    public MainboardMSI(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("Now in MSI Mainboard, cpuHoles = " + cpuHoles);
    }

}

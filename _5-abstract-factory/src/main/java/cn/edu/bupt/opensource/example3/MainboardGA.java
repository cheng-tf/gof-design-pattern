package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: MainboardGA</p>
 * <p>Description: 技嘉 主板 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 10:02</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class MainboardGA implements Mainboard {

    // CPU插槽的孔数
    private int cpuHoles = 0;

    // 构造方法
    public MainboardGA(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("Now in GA Mainboard, cpuHoles = " + cpuHoles);
    }

}

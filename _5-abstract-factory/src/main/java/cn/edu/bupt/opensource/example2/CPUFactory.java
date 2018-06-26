package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: CPUFactory</p>
 * <p>Description: CPU的简单工厂 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 10:13</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class CPUFactory {

    /**
     * 创建CPU接口对象
     */
    public static CPU createCPU(int cpuType) {
        CPU cpu = null;
        if(cpuType == 1) {
            cpu = new CPUIntel(1156);
        } else if(cpuType == 2) {
            cpu = new CPUAmd(939);
        }
        return cpu;
    }

}

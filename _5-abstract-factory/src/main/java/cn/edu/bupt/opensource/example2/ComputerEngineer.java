package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: ComputerEngineer</p>
 * <p>Description: 装机工程师类 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 10:06</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ComputerEngineer {

    // 定义组装机器所需的CPU
    private CPU cpu = null;

    // 定义组装机器所需的主板
    private Mainboard mainboard  = null;


    /**
     * 装机过程
     * @param cpuType       CPU类型
     * @param mainboardType 主板类型
     */
    public void makeComputer(int cpuType, int mainboardType) {
        // #1 准备装机配件
        prepareHardwares(cpuType, mainboardType);

        // #2 组装机器

        // #3 测试机器

        // #4 交付客户

    }

    private void prepareHardwares(int cpuType, int mainboardType) {
        // 准备CPU、主板的具体实现，但装机工程师不知道如何创建，怎么办？
        // #1 直接找相应的简单工厂获取
        this.cpu = CPUFactory.createCPU(cpuType);
        this.mainboard = MainboardFactory.createMainboard(mainboardType);
        // #2 测试配件是否可用
        this.cpu.calculate();
        this.mainboard.installCPU();
    }

}


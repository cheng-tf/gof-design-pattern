package cn.edu.bupt.opensource.example3;

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
     * @param scheme 装机方案
     */
    public void makeComputer(AbstractFactory scheme) {
        // #1 准备装机配件
        prepareHardwares(scheme);

        // #2 组装机器

        // #3 测试机器

        // #4 交付客户

    }

    private void prepareHardwares(AbstractFactory scheme) {
        // #1 使用抽象工厂获取相应的接口对象
        this.cpu = scheme.createCPU();
        this.mainboard = scheme.createMainboard();
        // #2 测试配件是否可用
        this.cpu.calculate();
        this.mainboard.installCPU();
    }

}


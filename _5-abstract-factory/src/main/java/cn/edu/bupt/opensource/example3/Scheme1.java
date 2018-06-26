package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Scheme1</p>
 * <p>Description: 装机方案1：Intel CPU + 技嘉主板 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 10:33</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Scheme1 implements AbstractFactory {

    @Override
    public CPU createCPU() {
        return new CPUIntel(1156);
    }

    @Override
    public Mainboard createMainboard() {
        return new MainboardGA(1156);
    }

}

package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Scheme2</p>
 * <p>Description: 装机方案2：AMD CPU + 微星主板 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 10:34</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Scheme2 implements AbstractFactory {

    @Override
    public CPU createCPU() {
        return new CPUAmd(939);
    }

    @Override
    public Mainboard createMainboard() {
        return new MainboardMSI(939);
    }

}

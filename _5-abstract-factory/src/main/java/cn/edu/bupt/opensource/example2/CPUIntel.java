package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: CPUIntel</p>
 * <p>Description: Intel CPU </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 09:58</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class CPUIntel implements CPU {

    // 针脚数目
    private int pins = 0;

    // 构造方法
    public CPUIntel(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Now in Intel CPU, pins = " + pins);
    }

}

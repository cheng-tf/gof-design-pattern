package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: CPUAmd</p>
 * <p>Description: AMD CPU </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 10:00</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class CPUAmd implements CPU {


    // 针脚数目
    private int pins = 0;

    // 构造方法
    public CPUAmd(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Now in AMD CPU, pins = " + pins);
    }

}

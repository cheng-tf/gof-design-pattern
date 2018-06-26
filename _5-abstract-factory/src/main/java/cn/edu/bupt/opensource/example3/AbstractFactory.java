package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: AbstractFactory</p>
 * <p>Description: 抽象工厂接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 10:31</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface AbstractFactory {

    /**
     * 创建CPU对象
     */
    CPU createCPU();

    /**
     * 创建主板对象
     */
    Mainboard createMainboard();

}

package cn.edu.bupt.opensource.example;
/**
 * <p>Title: Context</p>
 * <p>Description: 上下文对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 19:35</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Context {

    // 策略
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 转调
     */
    public void context() {
        strategy.algorithm();
    }

}

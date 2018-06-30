package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Context</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 12:57</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Context {

    // 状态
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    /**
     * 客户端调用
     */
    public void request(String samleParam) {
        state.handle(samleParam);
    }

}

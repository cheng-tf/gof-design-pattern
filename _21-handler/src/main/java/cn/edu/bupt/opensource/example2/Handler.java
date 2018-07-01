package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Handler</p>
 * <p>Description: 职责接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 21:50</p>
 * @author ChengTengfei
 * @version 1.0
 *
 */
public abstract class Handler {

    // 后继职责对象
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的请求
     */
    public abstract String handleFeeRequest(String user, double fee);

}

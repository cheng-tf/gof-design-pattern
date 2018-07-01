package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: ManagerProject</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 11:10</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ManagerProject extends Handler{

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if(fee < 500) {
            if("孙中山".equals(user)) {
                str = "项目经理同意" + user + "聚餐费用" + fee + "元的请求";
            } else {
                str = "项目经理不同意" + user + "聚餐费用" + fee + "元的请求";
            }
            return str;
        } else {
            // 若超过500，继续传递给级别更高的人处理
            if(this.successor != null) {
                return this.successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }

}

package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: ManagerDep</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 11:10</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ManagerDep extends Handler{

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if(fee < 1000) {
            if("孙中山".equals(user)) {
                str = "部门经理同意" + user + "聚餐费用" + fee + "元的请求";
            } else {
                str = "部门经理不同意" + user + "聚餐费用" + fee + "元的请求";
            }
            return str;
        } else {
            // 若超过1000，继续传递给级别更高的人处理
            if(this.successor != null) {
                return this.successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }

}

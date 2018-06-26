package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: User</p>
 * <p>Description: 人员 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 18:20</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class User {

    // 人员编号
    private String userId;

    // 人员名称
    private String userName;

    /**
     * 人员离职
     */
    public boolean deleteUser() {
        Mediator.getInstance().deleteUser(userId);
        return true;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

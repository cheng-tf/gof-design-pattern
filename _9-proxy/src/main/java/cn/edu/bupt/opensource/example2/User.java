package cn.edu.bupt.opensource.example2;
/**
 * <p>Title: User</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 23:12</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class User {

    // 用户ID
    private String userId;

    // 姓名
    private String name;

    // 部门ID
    private String deptId;

    // 性别
    private String sex;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", deptId='" + deptId + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

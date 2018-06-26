package cn.edu.bupt.opensource.example3;
/**
 * <p>Title: DeptUserModel</p>
 * <p>Description: 部门与人员的关系 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 18:27</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class DeptUserModel {

    // 部门与人员的关系编号
    private String deptUserId;

    // 部门编号
    private String deptId;

    // 人员编号
    private String userId;

    public String getDeptUserId() {
        return deptUserId;
    }

    public void setDeptUserId(String deptUserId) {
        this.deptUserId = deptUserId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}

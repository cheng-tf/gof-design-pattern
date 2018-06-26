package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: Dept</p>
 * <p>Description: 部门 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 18:18</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Dept {

    // 部门编号
    private String deptId;

    // 部门名称
    private String deptName;

    /**
     * 撤销部门
     */
    public boolean deleteDept() {
        Mediator.getInstance().deleteDept(deptId);
        return true;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


}

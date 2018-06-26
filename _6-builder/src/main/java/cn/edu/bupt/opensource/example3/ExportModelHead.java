package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: ExportModelHead</p>
 * <p>Description: 文件头 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 12:43</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ExportModelHead {

    // 分公司或门市点编号
    private String deptId;

    // 导出日期
    private String exportDate;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getExportDate() {
        return exportDate;
    }

    public void setExportDate(String exportDate) {
        this.exportDate = exportDate;
    }
}

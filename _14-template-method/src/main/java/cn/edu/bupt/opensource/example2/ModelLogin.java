package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: LoginModel</p>
 * <p>Description: 登录人员填写的数据 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 18:22</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ModelLogin {

    // 登录人员编号
    private String loginId;

    // 登录密码
    private String pwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}

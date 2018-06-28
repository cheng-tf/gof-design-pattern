package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: LoginTemplate</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 18:28</p>
 * @author ChengTengfei
 * @version 1.0
 */
public abstract class LoginTemplate {

    /**
     * 判断是否登录成功
     */
    public final boolean login(ModelLogin login) {

        ModelLogin data = this.findLoginUser(login.getLoginId());
        if(data != null) {
            String encryptPwd = this.encrypt(login.getPwd());
            login.setPwd(encryptPwd);
            return data.getLoginId().equals(login.getLoginId()) && data.getPwd().equals(login.getPwd());
        }
        return false;
    }

    /**
     * 根据登录编号查询登录人员的数据
     */
    public abstract ModelLogin findLoginUser(String loginId);

    /**
     * 密码加密
     */
    public String encrypt(String pwd) {
        return pwd;
    }

}

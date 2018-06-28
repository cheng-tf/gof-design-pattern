package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: LoginWorker</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 18:44</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class LoginWorker extends LoginTemplate {

    @Override
    public ModelLogin findLoginUser(String loginId) {
        ModelLogin data = new ModelLogin();
        data.setLoginId(loginId);
        data.setPwd("workerPwd");
        return data;
    }

    @Override
    public String encrypt(String pwd) {
        System.out.println("使用MD5进行密码加密");
        return pwd;
    }

}

package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: LoginNormal</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-28 18:43</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class LoginNormal extends LoginTemplate {

    @Override
    public ModelLogin findLoginUser(String loginId) {
        ModelLogin data = new ModelLogin();
        data.setLoginId(loginId);
        data.setPwd("normalPwd");
        return data;
    }

}

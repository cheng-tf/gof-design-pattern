package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: UserApi</p>
 * <p>Description: 定义用户数据对象的接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 09:48</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface UserApi {

    String getUserId();

    void setUserId(String userId);

    String getName();

    void setName(String name);

    String getDeptId();

    void setDeptId(String deptId);

    String getSex();

    void setSex(String sex);


}

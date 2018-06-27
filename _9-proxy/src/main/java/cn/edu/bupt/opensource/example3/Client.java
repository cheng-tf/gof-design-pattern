package cn.edu.bupt.opensource.example3;

import java.util.List;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 23:25</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        List<UserApi> users = userManager.getUsersByDeptId("0101");
        // #1 只显示用户名称
        for(UserApi user : users) {
            System.out.println("用户编号：" + user.getUserId() + "，用户姓名：" + user.getName());
        }
        // #2 显示用户完整数据，则需要重新查询数据库
        for(UserApi user : users) {
            System.out.println("重新查询数据库 用户编号：" + user.getUserId() + "，用户姓名：" + user.getName() + "，用户部门编号：" + user.getDeptId()
                        + "，用户性别" + user.getSex());
        }
    }

}

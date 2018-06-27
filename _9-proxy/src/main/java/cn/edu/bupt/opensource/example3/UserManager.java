package cn.edu.bupt.opensource.example3;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: UserManager</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 23:14</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class UserManager {

    /**
     * 根据部门ID查询用户
     * @return
     */
    public List<UserApi> getUsersByDeptId(String deptId) {
        List<UserApi> users = new ArrayList<>();
        Connection conn = null;
        try {
            conn = getConnection();
            String sql = "select * from tb_user u, tb_dept d where u.deptid = d.deptid and d.deptid like ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, deptId + "%");
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                Proxy proxy = new Proxy(new User());
                proxy.setUserId(result.getString("userId"));
                proxy.setName(result.getString("name"));
                users.add(proxy);
            }
            result.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    private Connection getConnection() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useSSL=true";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }





}

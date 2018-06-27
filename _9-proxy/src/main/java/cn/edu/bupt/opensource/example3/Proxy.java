package cn.edu.bupt.opensource.example3;

import java.sql.*;

/**
 * <p>Title: Proxy</p>
 * <p>Description: 代理对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 09:50</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Proxy implements UserApi {

    // 具体的目标对象
    private User realSubject = null;

    public Proxy(User realSubject) {
        this.realSubject = realSubject;
    }

    // 标记是否已重新装载过数据
    private boolean loaded = false;

    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    @Override
    public String getDeptId() {
        if(!this.loaded) {
            reload();
            this.loaded = true;
        }
        return realSubject.getDeptId();
    }

    @Override
    public void setDeptId(String deptId) {
        realSubject.setDeptId(deptId);
    }

    @Override
    public String getSex() {
        if(!this.loaded) {
            reload();
            this.loaded = true;
        }
        return realSubject.getSex();
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }

    /**
     * 重新查询数据库已获得完整的用户数据
     */
    private void reload() {
        Connection conn = null;
        try {
            conn = getConnection();
            String sql = "select * from tb_user where userid = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, realSubject.getUserId());
            ResultSet result = statement.executeQuery();
            while(result.next()) {
                realSubject.setSex(result.getString("sex"));
                realSubject.setDeptId(result.getString("deptId"));
            }
            result.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8&useSSL=true";
        String username = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}

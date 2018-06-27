package cn.edu.bupt.opensource.example4;

/**
 * <p>Title: OrderApi</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 10:40</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface OrderApi {

    String getProductName();

    void setProductName(String productName, String user);

    int getOrderNum();

    void setOrderNum(int orderNum, String user);

    String getUser();

    void setUser(String user);

}

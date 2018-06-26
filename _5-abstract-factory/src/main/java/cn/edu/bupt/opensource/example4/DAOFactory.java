package cn.edu.bupt.opensource.example4;

/**
 * <p>Title: DAOFactory</p>
 * <p>Description: 抽象工厂 创建订单、订单明细的DAO接口对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 11:13</p>
 * @author ChengTengfei
 * @version 1.0
 */
public interface DAOFactory {

    /**
     * 创建订单接口对象
     */
    OrderDAO createOrderDAO();

    /**
     * 创建订单明细接口对象
     */
    OrderDetailDAO createOrderDetailDAO();

}

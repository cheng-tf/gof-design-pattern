package cn.edu.bupt.opensource.example4;

/**
 * <p>Title: DAOFactoryRdb</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 11:17</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class DAOFactoryRdb implements DAOFactory {

    @Override
    public OrderDAO createOrderDAO() {
        return new OrderDAORdbImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new OrderDetailDAORdbImpl();
    }

}

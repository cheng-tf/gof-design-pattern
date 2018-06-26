package cn.edu.bupt.opensource.example4;

/**
 * <p>Title: DAOFactoryXml</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 11:16</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class DAOFactoryXml implements DAOFactory{

    @Override
    public OrderDAO createOrderDAO() {
        return new OrderDAOXmlImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new OrderDetailDAOXmlImpl();
    }

}

package cn.edu.bupt.opensource.example4;

/**
 * <p>Title: Business</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 11:17</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Business {

    public static void main(String[] args) {
        DAOFactory df = new DAOFactoryRdb();
        df.createOrderDAO().saveOrder();
        df.createOrderDetailDAO().saveOrderDetail();
    }

}

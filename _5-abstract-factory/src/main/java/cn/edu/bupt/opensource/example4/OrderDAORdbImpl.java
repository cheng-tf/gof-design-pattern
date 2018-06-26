package cn.edu.bupt.opensource.example4;

/**
 * <p>Title: OrderDAORdbImpl</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 11:10</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class OrderDAORdbImpl implements OrderDAO {

    @Override
    public void saveOrder() {
        System.out.println("Now in OrderDAORdbImpl.saveOrder");
    }

}

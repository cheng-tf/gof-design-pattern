package cn.edu.bupt.opensource.example4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <p>Title: ManagerPay</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 18:31</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ManagerPay extends Aggregate {

    public Iterator createIterator() {
        return payModelList.iterator();
    }

    // 使用List管理
    private List<PayModel> payModelList = new ArrayList<>();

    /**
     * 获取工资列表
     */
    public List<PayModel> getPayList() {
        return payModelList;
    }

    /**
     * 计算工资
     */
    public void calSalary() {
        // 测试数据
        PayModel payModel = new PayModel();
        payModel.setUsername("相遇");
        payModel.setPay(1500);
        PayModel payModel2 = new PayModel();
        payModel2.setUsername("孟子");
        payModel2.setPay(3200);
        payModelList.add(payModel);
        payModelList.add(payModel2);
    }


}

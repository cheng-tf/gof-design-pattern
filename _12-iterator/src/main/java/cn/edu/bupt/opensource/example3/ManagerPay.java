package cn.edu.bupt.opensource.example3;

import java.util.ArrayList;
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

    @Override
    public Iterator createIterator() {
        return new IteratorList(this);
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
        payModel.setUsername("孔子");
        payModel.setPay(1500);
        PayModel payModel2 = new PayModel();
        payModel2.setUsername("孟子");
        payModel2.setPay(3200);
        payModelList.add(payModel);
        payModelList.add(payModel2);
    }

    /**
     * 获取索引所对应的元素
     */
    public Object get(int index){
        Object object = null;
        if(index < payModelList.size()) {
            object = payModelList.get(index);
        }
        return object;
    }

    /**
     * 获取聚合对象的大小
     */
    public int size() {
        return payModelList.size();
    }



}

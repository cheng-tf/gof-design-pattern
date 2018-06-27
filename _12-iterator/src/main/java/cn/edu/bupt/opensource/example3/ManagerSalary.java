package cn.edu.bupt.opensource.example3;

/**
 * <p>Title: ManagerSalary</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 18:26</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ManagerSalary extends Aggregate {

    @Override
    public Iterator createIterator() {
        return new IteratorArray(this);
    }

    // 使用数组管理
    private PayModel[] payModels = null;

    /**
     * 获取工资列表
     */
    public PayModel[] getPays() {
        return payModels;
    }

    /**
     * 计算工资
     */
    public void calSalary() {
        // 测试数据
        PayModel payModel = new PayModel();
        payModel.setUsername("蒋中正");
        payModel.setPay(3000);
        PayModel payModel2 = new PayModel();
        payModel2.setUsername("鲁迅");
        payModel2.setPay(2000);
        payModels = new PayModel[2];
        payModels[0] = payModel;
        payModels[1] = payModel2;
    }

    /**
     * 获取索引所对应的元素
     */
    public Object get(int index){
        Object object = null;
        if(index < payModels.length) {
            object = payModels[index];
        }
        return object;
    }

    /**
     * 获取聚合对象的大小
     */
    public int size() {
        return payModels.length;
    }

}

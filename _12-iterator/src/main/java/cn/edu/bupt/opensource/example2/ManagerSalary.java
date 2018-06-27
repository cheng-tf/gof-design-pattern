package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: ManagerSalary</p>
 * <p>Description: 被客户收购的工资管理系统 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 17:48</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ManagerSalary {

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
        payModel.setUsername("孙中山");
        payModel.setPay(3000);
        PayModel payModel2 = new PayModel();
        payModel2.setUsername("鲁迅");
        payModel2.setPay(2000);
        payModels = new PayModel[2];
        payModels[0] = payModel;
        payModels[1] = payModel2;
    }

}

package cn.edu.bupt.opensource.example2;

import java.util.Iterator;
import java.util.List;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 17:58</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 访问本集团的工资列表
        ManagerPay managerPay = new ManagerPay();
        managerPay.calSalary();
        List<PayModel> payModelList = managerPay.getPayList();
        Iterator iterator = payModelList.iterator();
        System.out.println("集团工资列表：");
        while(iterator.hasNext()) {
            System.out.println((PayModel) iterator.next());
        }
        // #2 访问被收购公司的工资列表
        ManagerSalary managerSalary = new ManagerSalary();
        managerSalary.calSalary();
        PayModel[] payModels = managerSalary.getPays();
        System.out.println("被收购公司的工资列表：");
        for(PayModel payModel : payModels) {
            System.out.println(payModel);
        }

    }

}

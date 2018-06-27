package cn.edu.bupt.opensource.example4;

import java.util.Iterator;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 18:35</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 访问本集团的工资列表
        ManagerPay managerPay = new ManagerPay();
        managerPay.calSalary();
        System.out.println("集团的工资列表：");
        test(managerPay.createIterator());


        // #2 访问被收购公司的工资列表
        ManagerSalary managerSalary = new ManagerSalary();
        managerSalary.calSalary();
        System.out.println("被收购公司的工资列表：");
        test(managerSalary.createIterator());
    }

    private static void test(Iterator iterator) {
        while(iterator.hasNext()) {
            System.out.println((PayModel) iterator.next());
        }
    }



}

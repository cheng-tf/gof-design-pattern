package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 11:00</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 组装责任链
        Handler managerProject = new ManagerProject();
        Handler managerDep = new ManagerDep();
        Handler managerGeneral = new ManagerGeneral();
        managerProject.setSuccessor(managerDep);
        managerDep.setSuccessor(managerGeneral);
        // #2 提交请求
        System.out.println("Return：" + managerProject.handleFeeRequest("孙中山", 800));
    }

}

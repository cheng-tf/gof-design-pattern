package cn.edu.bupt.opensource.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: Mediator</p>
 * <p>Description: 中介者（仅示例离职） </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 18:24</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Mediator {

    private static Mediator mediator = new Mediator();

    private Mediator() {
        initTestData();
    }

    public static Mediator getInstance() {
        return mediator;
    }

    private List<DeptUserModel> deptUserModelList = new ArrayList<>();


    /**
     * 撤销部门
     */
    public boolean deleteDept(String deptId) {
        List<DeptUserModel> tmpArr = new ArrayList<>();
        for(DeptUserModel model : deptUserModelList) {
            if(model.getDeptId().equals(deptId)) {
                tmpArr.add(model);
            }
        }
        deptUserModelList.remove(tmpArr);
        return true;
    }

    /**
     * 人员离职
     */
    public boolean deleteUser(String userId) {
        List<DeptUserModel> tmpArr = new ArrayList<>();
        for(DeptUserModel model : deptUserModelList) {
            if(model.getUserId().equals(userId)) {
                tmpArr.add(model);
            }
        }
        deptUserModelList.remove(tmpArr);
        return true;
    }


    /**
     * 测试数据
     */
    private void initTestData() {
        DeptUserModel model = new DeptUserModel();
        model.setDeptUserId("DU1");
        model.setDeptId("d1");
        model.setUserId("u1");
        deptUserModelList.add(model);
        model = new DeptUserModel();
        model.setDeptUserId("DU2");
        model.setDeptId("d1");
        model.setUserId("u2");
        deptUserModelList.add(model) ;
        model = new DeptUserModel();
        model.setDeptUserId("DU3");
        model.setDeptId("d2");
        model.setUserId("u3");
        deptUserModelList.add(model) ;
        model = new DeptUserModel();
        model.setDeptUserId("DU4");
        model.setDeptId("d2");
        model.setUserId("u4");
        deptUserModelList.add(model) ;
        model = new DeptUserModel();
        model.setDeptUserId("DU5");
        model.setDeptId("d2");
        model.setUserId("u1");
        deptUserModelList.add(model) ;
    }


}

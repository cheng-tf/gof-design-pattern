package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteHandler</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-07-01 10:56</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteHandler extends Handler {

    @Override
    public void handleRequest() {
        // 根据条件判断(外部传入/从数据库中获取)是否属于自己的职责范围
        boolean someCondition = false;
        if(someCondition) {
            System.out.println("ConcreteHandler handle request.");
        } else {
            if(this.successor != null) {
                this.successor.handleRequest();
            }
        }
    }


}

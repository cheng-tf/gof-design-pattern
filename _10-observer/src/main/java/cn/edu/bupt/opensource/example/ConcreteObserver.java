package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteObserver</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 11:29</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteObserver implements Observer {

    // 观察者状态
    private String observerState;

    @Override
    public void update(Subject subject) {
        // 具体的更新视线
        observerState = ((ConcreteSubject) subject).getSubjectState();
    }

}

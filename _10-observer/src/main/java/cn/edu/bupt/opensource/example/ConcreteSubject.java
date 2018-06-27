package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ConcreteSubject</p>
 * <p>Description: 具体目标对象：负责将有关状态存入观察者对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 11:30</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ConcreteSubject extends Subject {

    // 目标对象的状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        // 若状态发生改变，通知所有观察者
        this.notifyObservers();
    }
}

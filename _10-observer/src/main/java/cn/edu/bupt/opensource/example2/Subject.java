package cn.edu.bupt.opensource.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: Subject</p>
 * <p>Description: 目标对象接口 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-27 11:29</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Subject {

    // 观察者列表
    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者(添附)
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者(解附)
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有观察者对象(通知)
     */
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

}

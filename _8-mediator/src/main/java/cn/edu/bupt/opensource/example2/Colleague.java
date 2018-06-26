package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Colleague</p>
 * <p>Description: 同事父类 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 17:09</p>
 * @author ChengTengfei
 * @version 1.0
 */
public abstract class Colleague {

    // 中介者
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

}

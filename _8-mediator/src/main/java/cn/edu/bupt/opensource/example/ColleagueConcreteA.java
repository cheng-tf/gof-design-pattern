package cn.edu.bupt.opensource.example;

/**
 * <p>Title: ColleagueConcreteA</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 17:12</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class ColleagueConcreteA extends Colleague {

    public ColleagueConcreteA(Mediator mediator) {
        super(mediator);
    }

    public void someOperation() {
        getMediator().changed(this);
    }


}

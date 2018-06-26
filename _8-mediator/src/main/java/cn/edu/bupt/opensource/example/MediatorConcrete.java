package cn.edu.bupt.opensource.example;
/**
 * <p>Title: MediatorConcrete</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-26 17:15</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class MediatorConcrete implements Mediator {

    // 同事对象A
    private ColleagueConcreteA colleagueA;

    // 同事对象B
    private ColleagueConcreteB colleagueB;

    public void setColleagueA(ColleagueConcreteA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ColleagueConcreteB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void changed(Colleague colleague) {

    }


}

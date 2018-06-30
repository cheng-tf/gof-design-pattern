package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Originator</p>
 * <p>Description: 原发器对象 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 14:44</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Originator {

    // 备忘录的实现
    // 设置为私有内部类，不对外开放
    private static class MementoImpl implements Memento {

        // 保存的状态
        private String state = "";

        public MementoImpl(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    // 状态
    private String state = "";

    /**
     * 创建备忘录对象
     */
    public Memento createMemento() {
        return new MementoImpl(state);
    }

    /**
     * 重新设置原发器的状态，恢复为备忘录对象记录的状态
     * @param memento
     */
    public void setMemento(Memento memento) {
        this.state = ((MementoImpl) memento).getState();
    }

}

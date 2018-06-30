package cn.edu.bupt.opensource.example;

/**
 * <p>Title: Caretaker</p>
 * <p>Description: 备忘录管理者 </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 14:42</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Caretaker {

    // 备忘录
    private Memento memento = null;

    /**
     * 保存备忘录对象
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    /**
     * 获取备忘录对象
     */
    public Memento retriveMemento() {
        return memento;
    }


}

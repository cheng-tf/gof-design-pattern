package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: FlowAMockCaretaker</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 14:57</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class FlowAMockCaretaker {

    // 备忘录
    private FlowAMockMemento memento = null;

    /**
     * 保存备忘录对象
     */
    public void saveMemento(FlowAMockMemento memento) {
        this.memento = memento;
    }

    /**
     * 获取备忘录对象
     */
    public FlowAMockMemento retriveMemento() {
        return memento;
    }


}

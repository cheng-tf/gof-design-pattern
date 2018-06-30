package cn.edu.bupt.opensource.example2;

/**
 * <p>Title: Client</p>
 * <p>Description: </p>
 * <p>Company: bupt.edu.cn</p>
 * <p>Created: 2018-06-30 15:09</p>
 * @author ChengTengfei
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // #1 创建原发器
        FlowAMock flowAMock = new FlowAMock("testFlow");
        flowAMock.runPhaseOne();
        // #2 创建管理者
        FlowAMockCaretaker caretaker = new FlowAMockCaretaker();
        caretaker.saveMemento(flowAMock.createMemento());
        // #3 执行方案一
        flowAMock.runPhaseTwoScheme1();
        // #4 恢复，并执行方案二
        flowAMock.setMemento(caretaker.retriveMemento());
        flowAMock.runPhaseTwoScheme2();
    }


}
